package com.example.botpoc.Controller;

import com.example.botpoc.Entity.BotCondition;
import com.example.botpoc.Service.BotConditionService;
import com.example.botpoc.dto.InputRequest;
import com.example.botpoc.loggers.GlobalResources;
import com.example.botpoc.serviceImpl.BotConditionServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


@RestController
@RequestMapping("/api/condition")
public class BotConditionController {

    private Logger logger = GlobalResources.getLogger(BotConditionController.class);

//    ConcurrentMap<String,BotCondition> botConditionConcurrentMap = new ConcurrentHashMap<>();

    @Autowired
    BotConditionService botConditionService ;

    @PostMapping("/save")
    public BotCondition saveBotConditions(@RequestBody InputRequest<BotCondition> request){
        String methodName= "saveBotConditions";
        logger.info(methodName + "Called");
//        BotCondition bo = botConditionService.saveBotCondition(b);
//        return botConditionConcurrentMap.get(bo);
        return botConditionService.saveBotCondition(request);
    }
    @GetMapping("/getall")
    public List<BotCondition> getAllCondition(){
        String methodName= "getAllCondition";
        logger.info(methodName + "Called");
        List<BotCondition> botConditionList = botConditionService.getAllCondition();
//        return (List<BotCondition>) botConditionConcurrentMap.get(botConditionList);
        return botConditionList;
    }

    @GetMapping("/getbyid/{id}")
    public BotCondition getById(@PathVariable int id){
//        String methodName= "getById";
//        logger.info(methodName + "Called");
        BotCondition Bo =botConditionService.getById(id);
//        return botConditionConcurrentMap.get(Bo);
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
    public BotCondition updateBotCondition(@RequestBody InputRequest<BotCondition> request, int id){
        String methodName= "updateCondition";
        logger.info(methodName + "Called");
        return botConditionService.updateBotCondition(request, id);
    }

//    @GetMapping("/findbyname/{name}")
//    public BotCondition findConditionByName(@PathVariable String name){
//        BotCondition byName= botConditionService.findByName(name);
//        return byName;
//    }
}
