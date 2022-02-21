package com.example.botpoc.serviceImpl;

import com.example.botpoc.Entity.BotSchedule;
import com.example.botpoc.Repo.BotScheduleRepo;
import com.example.botpoc.Service.BotScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotScheduleServiceImp implements BotScheduleService {
    @Autowired
    BotScheduleRepo botScheduleRepo;

    public BotSchedule saveBotSchedule(BotSchedule b){
         BotSchedule B=botScheduleRepo.save(b);
         return B;
    }

    @Override
    public List<BotSchedule> getAll() {
        List<BotSchedule> botScheduleList = botScheduleRepo.findAll();
        return botScheduleList;
    }

    @Override
    public BotSchedule getById(int id) {
        BotSchedule botSchedule = botScheduleRepo.findById(id).get();
        return botSchedule;
    }

    @Override
    public void deleteAll(){
        botScheduleRepo.deleteAll();
    }

    @Override
    public void deleteById(int id) {
        botScheduleRepo.deleteById(id);

    }

    @Override
    public BotSchedule updateBotSchedule(BotSchedule botSchedule) {
        BotSchedule existingSchedule = botScheduleRepo.findById(botSchedule.getId()).orElse(botSchedule);
        existingSchedule.setDay(botSchedule.getDay());
        existingSchedule.setMethod(botSchedule.getMethod());
        existingSchedule.setTrigger(botSchedule.getTrigger());
        existingSchedule.setTriggerType(botSchedule.getTriggerType());
        existingSchedule.setWeek(botSchedule.getWeek());
        return botScheduleRepo.save(existingSchedule);
    }

}
