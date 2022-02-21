package com.example.botpoc.Controller;

import com.example.botpoc.Entity.BotCondition;
import com.example.botpoc.loggers.GlobalResources;
import com.example.botpoc.serviceImpl.BotConditionServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/condition")
public class BotConditionController {

    private Logger logger = GlobalResources.getLogger(BotConditionController.class);

    @Autowired
    BotConditionServiceImp botConditionService ;

    @PostMapping("/save")
    public BotCondition saveBotConditions(@RequestBody BotCondition b){
        String methodName= "saveBotConditions";
        logger.info(methodName + "Called");
        BotCondition bo = botConditionService.saveBotCondition(b);
        return bo;
    }
    @GetMapping("/getall")
    public List<BotCondition> getAllCondition(){
        String methodName= "getAllCondition";
        logger.info(methodName + "Called");
        List<BotCondition> botConditionList = botConditionService.getAllCondition();
        return botConditionList;
    }

    @GetMapping("/getbyid/{id}")
    public BotCondition getById(@PathVariable int id){
        String methodName= "getById";
        logger.info(methodName + "Called");
        BotCondition Bo =botConditionService.getById(id);
        return Bo;
    }

    @DeleteMapping("/deleteall")
    public void deleteAll(){
        String methodName= "deleteAll";
        logger.info(methodName + "Called");
        botConditionService.deleteAll();
    }

    @DeleteMapping("/deletebyid/{id}")
    public void deleteById(@PathVariable int id){
        String methodName= "deleteById";
        logger.info(methodName + "Called");
        botConditionService.deleteConditionById(id);
    }

    @PutMapping("/updatecondition")
    public BotCondition updateBotCondition(@RequestBody BotCondition botCondition){
        String methodName= "updateCondition";
        logger.info(methodName + "Called");
        return botConditionService.updateBotCondition(botCondition);
    }
}
