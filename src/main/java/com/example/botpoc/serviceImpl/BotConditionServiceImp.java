package com.example.botpoc.serviceImpl;

import com.example.botpoc.Entity.BotCondition;
import com.example.botpoc.Repo.BotConditionRepo;
//import com.example.botpoc.Service.BotConditionService;
import com.example.botpoc.Service.BotConditionService;
import com.example.botpoc.loggers.GlobalResources;
import org.apache.tomcat.jni.Global;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotConditionServiceImp implements BotConditionService {

    private Logger logger = GlobalResources.getLogger(BotConditionServiceImp.class);

    @Autowired
    BotConditionRepo botConditionRepo;

    @Override
    public BotCondition saveBotCondition(BotCondition b){

        String methodName= "saveBotConditions";
        logger.info(methodName + "Called");
        BotCondition B = botConditionRepo.save(b);
        return B;
    }

    @Override
    public List<BotCondition> getAllCondition(){
        String methodName= "getAllCondition";
        logger.info(methodName + "Called");
        List<BotCondition> botConditionList =botConditionRepo.findAll();
        return botConditionList;
    }

    @Override
    public BotCondition getById(int id){
        String methodName= "getById";
        logger.info(methodName + "Called");
        BotCondition B= botConditionRepo.findById(id).get();
        return B;
    }

    @Override
    public void deleteAll(){
        String methodName= "deleteAll";
        logger.info(methodName + "Called");
        botConditionRepo.deleteAll();
    }

    @Override
    public void deleteConditionById(int id){
        String methodName= "deleteConditionById";
        logger.info(methodName + "Called");
        botConditionRepo.deleteById(id);
    }

    @Override
    public BotCondition updateBotCondition(BotCondition botCondition) {
        String methodName= "updateBotCondition";
        logger.info(methodName + "Called");
        BotCondition existingCondition = botConditionRepo.findById(botCondition.getId()).orElse(botCondition);
        existingCondition.setCondition(botCondition.getCondition());
        existingCondition.setTimeFrame(botCondition.getTimeFrame());
        return botConditionRepo.save(existingCondition);

    }

}
