package com.example.botpoc.Repo;

import com.example.botpoc.Entity.BotInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotInfoRepo extends JpaRepository<BotInfo,Integer> {


}
