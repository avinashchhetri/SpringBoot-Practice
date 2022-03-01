package com.example.botpoc.Controller;

import com.example.botpoc.Entity.BotCondition;
import com.example.botpoc.Entity.BotContent;
import com.example.botpoc.Service.BotContentService;
import com.example.botpoc.serviceImpl.BotContentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/content")
public class BotContentController {
    @Autowired
    BotContentService botContentServiceImp;

    @PostMapping("/save")
    public BotContent saveBotContent(@RequestBody BotContent b){
        BotContent B =botContentServiceImp.saveBotContent(b);
        return B;
    }

    @GetMapping("/getallcontent")
    public List<BotContent> getAllContent(){
        List<BotContent> contentList= botContentServiceImp.getAllContent();
        return contentList;
    }

    @GetMapping("/getbyid/{id}")
    public BotContent getById(@PathVariable int id){
        BotContent contentById = botContentServiceImp.getById(id);
        return contentById;
    }

    @PutMapping("/updatecontent")
    public BotContent updateContent(@RequestBody BotContent botContent){
        return  botContentServiceImp.updateBotContent(botContent);
    }

    @DeleteMapping("/deleteall")
    public void deleteAll(){
        botContentServiceImp.deleteAll();
    }


}
