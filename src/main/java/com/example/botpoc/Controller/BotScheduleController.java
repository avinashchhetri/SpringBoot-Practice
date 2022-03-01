package com.example.botpoc.Controller;

import com.example.botpoc.Entity.BotSchedule;
import com.example.botpoc.Repo.BotScheduleRepo;
import com.example.botpoc.Service.BotScheduleService;
import com.example.botpoc.serviceImpl.BotScheduleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class BotScheduleController {
    @Autowired
    BotScheduleService botScheduleServiceImp;

    @PostMapping("/save")
    public BotSchedule saveBotSchedule(@RequestBody BotSchedule s){
        BotSchedule B = botScheduleServiceImp.saveBotSchedule(s);
        return B;
    }

    @GetMapping("/getall")
    public List<BotSchedule> getAll(){
        List<BotSchedule> botSchedule = botScheduleServiceImp.getAll();
        return botSchedule;
    }

    @GetMapping("/getbyid/{id}")
    public BotSchedule getById(@PathVariable int id){
        BotSchedule botSchedule= botScheduleServiceImp.getById(id);
        return  botSchedule;
    }

    @DeleteMapping("/deletebyid/{id}")
    public void deleteById(@PathVariable int id){
        botScheduleServiceImp.deleteById(id);

    }

    @DeleteMapping("/deleteall")
    public void deleteAll(){
        botScheduleServiceImp.deleteAll();
    }

    @PutMapping("/update")
    public BotSchedule updateSchedule(@RequestBody BotSchedule updatedSchedule){
        BotSchedule botSchedule = botScheduleServiceImp.updateBotSchedule(updatedSchedule);
        return botSchedule;
    }

}
