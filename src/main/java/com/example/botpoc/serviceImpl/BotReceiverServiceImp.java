package com.example.botpoc.serviceImpl;

import com.example.botpoc.Entity.BotReceiver;
import com.example.botpoc.Repo.BotReceiverRepo;
import com.example.botpoc.Service.BotReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotReceiverServiceImp implements BotReceiverService {

    @Autowired
    BotReceiverRepo botReceiverRepo;


    public BotReceiver saveBotReceiver(BotReceiver botReceiver){
        BotReceiver receiver=botReceiverRepo.save(botReceiver);
        return receiver;
    }

//    @Override
//    public List<BotReceiver> getAllReceiver() {
//        List<BotReceiver> receiverList = botReceiverRepo.findAll();
//        return receiverList;
//    }

    @Override
    public BotReceiver getById(int id) {
        BotReceiver bReceiver= botReceiverRepo.findById(id).get();
        return bReceiver;
    }

    @Override
    public void deleteAll(){
        botReceiverRepo.deleteAll();
    }

    @Override
    public List<BotReceiver> getAll(){
        List<BotReceiver> botReceiverList = botReceiverRepo.findAll();
        return botReceiverList;
    }

    @Override
    public void deleteById(int id) {
        botReceiverRepo.deleteById(id);

    }

    @Override
    public BotReceiver updateBotReceiver(BotReceiver botReceiver) {
        BotReceiver existingReceiver = botReceiverRepo.findById(botReceiver.getId()).orElse(botReceiver);
        existingReceiver.setUserId(botReceiver.getUserId());
        return botReceiverRepo.save(existingReceiver);
    }

}
