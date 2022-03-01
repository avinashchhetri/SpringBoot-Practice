package com.example.botpoc.Controller;

import com.example.botpoc.Entity.BotInfo;
import com.example.botpoc.Service.BotInfoService;
import com.example.botpoc.serviceImpl.BotInfoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/info")
public class BotInfoController {

    @Autowired
    BotInfoService botInfoServiceImp;

    @PostMapping("/save")
    public BotInfo saveBotInfo(@RequestBody BotInfo i){
        BotInfo b =botInfoServiceImp.saveBotInfo(i);
        return b;
    }

    @DeleteMapping("/deleteall")
    public void deleteAll(){
        botInfoServiceImp.deleteAll();
    }

    @DeleteMapping("/deletebyid/{id}")
    public void deleteById(@PathVariable int id){
        botInfoServiceImp.deleteById(id);
    }

    @PutMapping("/update")
    public BotInfo updateBotInfo(@RequestBody BotInfo bInfo){
        BotInfo botInfo = botInfoServiceImp.updateBotInfo(bInfo);
        return  botInfo;
    }

    @GetMapping("/getbyid/{id}")
    public BotInfo getById(@PathVariable int id){
        BotInfo BotInfoId= botInfoServiceImp.getById(id);
        return BotInfoId;
    }

    @GetMapping("/getall")
    public List<BotInfo> getAll(){
        List<BotInfo> getAll = botInfoServiceImp.getAll();
        return getAll;
    }


}
