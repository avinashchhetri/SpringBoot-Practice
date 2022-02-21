package com.example.botpoc.Service;

import com.example.botpoc.Entity.BotCondition;
import com.example.botpoc.Entity.BotContent;

import java.util.List;

public interface BotContentService {


    public BotContent saveBotContent(BotContent bot);

    public List<BotContent> getAllContent();

    public BotContent getById(int id);

    public void deleteAll();

    public void deleteContentById(int id);

    public BotContent updateBotContent(BotContent botContent);


}
