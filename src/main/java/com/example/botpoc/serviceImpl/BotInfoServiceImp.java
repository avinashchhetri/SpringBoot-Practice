package com.example.botpoc.serviceImpl;

import com.example.botpoc.Entity.BotInfo;
import com.example.botpoc.Repo.BotInfoRepo;
//import com.example.botpoc.Service.BotInfoService;
import com.example.botpoc.Service.BotInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotInfoServiceImp implements BotInfoService {

    @Autowired
    BotInfoRepo botInfoRepo;


    public BotInfo saveBotInfo(BotInfo botInfo) {
        BotInfo bInfo= botInfoRepo.save(botInfo);
        return bInfo;
    }

    public void deleteAll() {
        botInfoRepo.deleteAll();

    }

    @Override
    public void deleteById(int id) {
        botInfoRepo.deleteById(id);
    }

    public BotInfo updateBotInfo(BotInfo botInfo) {
        BotInfo existingInfo= botInfoRepo.findById(botInfo.getId()).orElse(botInfo);
        existingInfo.setBotType(botInfo.getBotType());
        existingInfo.setClientId(botInfo.getClientId());
        existingInfo.setClientSecret(botInfo.getClientSecret());
        existingInfo.setMethods(botInfo.getMethods());
        existingInfo.setTenantId(botInfo.getTenantId());
        existingInfo.setTitle(botInfo.getTitle());
        return botInfoRepo.save(existingInfo);

    }

    public BotInfo getById(int id) {
        BotInfo bID = botInfoRepo.findById(id).get();
        return bID;
    }

    public List<BotInfo> getAll(){
        List<BotInfo> BIAll = botInfoRepo.findAll();
        return BIAll;
    }



}
