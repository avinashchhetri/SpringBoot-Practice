package com.example.botpoc.Service;

import com.example.botpoc.Entity.BotInfo;

import java.util.List;

public interface BotInfoService {
     BotInfo saveBotInfo(BotInfo botInfo);

     void deleteAll();
     void deleteById(int id);

     BotInfo updateBotInfo(BotInfo botInfo);

     BotInfo getById(int id);

     List<BotInfo> getAll();

}
