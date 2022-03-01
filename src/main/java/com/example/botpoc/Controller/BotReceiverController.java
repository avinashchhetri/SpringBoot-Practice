package com.example.botpoc.Controller;

import com.example.botpoc.Entity.BotContent;
import com.example.botpoc.Entity.BotReceiver;
import com.example.botpoc.Service.BotReceiverService;
import com.example.botpoc.serviceImpl.BotReceiverServiceImp;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receiver")
public class BotReceiverController {

    @Autowired
    BotReceiverService botReceiverServiceImp;

    @PostMapping("/save")
    public BotReceiver saveBotReceiver(@RequestBody BotReceiver botReceiver){
         BotReceiver receiver =botReceiverServiceImp.saveBotReceiver(botReceiver);
         return receiver;
    }
    @DeleteMapping("/deleteall")
    public void deleteAll(){
        botReceiverServiceImp.deleteAll();
    }

    @GetMapping("/getall")
    public List<BotReceiver> getAll(){
        List<BotReceiver> bList = botReceiverServiceImp.getAll();
        return  bList;
    }

    @GetMapping("/getbyid/{id}")
    public BotReceiver getById(@PathVariable int id){
        BotReceiver receiver = botReceiverServiceImp.getById(id);
        return  receiver;
    }

    @PutMapping("/update")
    public BotReceiver updateReceiver(@RequestBody BotReceiver botReceiver){
        BotReceiver updatedReceiver=botReceiverServiceImp.updateBotReceiver(botReceiver);
        return updatedReceiver;
    }
}
