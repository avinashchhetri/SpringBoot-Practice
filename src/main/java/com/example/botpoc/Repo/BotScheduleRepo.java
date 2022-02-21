package com.example.botpoc.Repo;

import com.example.botpoc.Entity.BotSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotScheduleRepo extends JpaRepository<BotSchedule,Integer> {
}
