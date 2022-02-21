package com.example.botpoc.Service;

import com.example.botpoc.Entity.BotCondition;

import java.util.List;

public interface BotConditionService {


    public BotCondition saveBotCondition(BotCondition b);

    public List<BotCondition> getAllCondition();

    public BotCondition getById(int id);

    public void deleteAll();


    public void deleteConditionById(int id);

    public BotCondition updateBotCondition(BotCondition botCondition);
}
