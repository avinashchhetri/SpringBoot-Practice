package com.example.botpoc.Service;

import com.example.botpoc.Entity.BotCondition;
import com.example.botpoc.dto.InputRequest;

import java.util.List;

public interface BotConditionService {


    BotCondition saveBotCondition(InputRequest<BotCondition> request);

    List<BotCondition> getAllCondition();

     BotCondition getById(int id);

     void deleteAll();


    void deleteConditionById(int id);


    BotCondition updateBotCondition(InputRequest<BotCondition> request, int id);

//    BotCondition findByName(String name);

}
