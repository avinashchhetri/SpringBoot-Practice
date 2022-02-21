package com.example.botpoc.Service;

import com.example.botpoc.Entity.BotCondition;
import com.example.botpoc.Entity.BotReceiver;

import java.util.List;

public interface BotReceiverService {


    public BotReceiver saveBotReceiver(BotReceiver botReceiver);

//    public List<BotReceiver> getAllReceiver();

    public BotReceiver getById(int id);

    public void deleteAll();
    public List<BotReceiver> getAll();


    public void deleteById(int id);

    public BotReceiver updateBotReceiver(BotReceiver botReceiver);
}
