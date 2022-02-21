package com.example.botpoc.Service;

import com.example.botpoc.Entity.BotSchedule;

import java.util.List;

public interface BotScheduleService {

    public BotSchedule saveBotSchedule(BotSchedule botSchedule);

    public List<BotSchedule> getAll();
    public BotSchedule getById(int id);



    public void deleteAll();
    public void deleteById(int id);

    public BotSchedule updateBotSchedule(BotSchedule botSchedule);

}
