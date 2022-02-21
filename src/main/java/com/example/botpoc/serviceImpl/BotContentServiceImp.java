package com.example.botpoc.serviceImpl;

import com.example.botpoc.Entity.BotCondition;
import com.example.botpoc.Entity.BotContent;
import com.example.botpoc.Repo.BotContentRepo;
import com.example.botpoc.Service.BotContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotContentServiceImp implements BotContentService {
    @Autowired
    BotContentRepo botContentRepo;

    @Override
    public BotContent saveBotContent(BotContent botContent){
        BotContent Bot =botContentRepo.save(botContent);
        return Bot;
    }

    @Override
    public List<BotContent> getAllContent() {
        List<BotContent> contentList= botContentRepo.findAll();
        return contentList;
    }


    @Override
    public BotContent getById(int id) {
        BotContent botContent = botContentRepo.findById(id).get();
        return botContent;
    }

    @Override
    public void deleteAll(){
        botContentRepo.deleteAll();
    }

    @Override
    public void deleteContentById(int id) {
        botContentRepo.deleteById(id);
    }

    @Override
    public BotContent updateBotContent(BotContent botContent) {
        BotContent existingContent=botContentRepo.findById(botContent.getId()).orElse(botContent);
        existingContent.setMessage(botContent.getMessage());
        return botContentRepo.save(existingContent);
    }


}
