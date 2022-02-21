package com.example.botpoc.Repo;

import com.example.botpoc.Entity.BotReceiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotReceiverRepo extends JpaRepository<BotReceiver, Integer> {
}
