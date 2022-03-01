package com.example.botpoc.Repo;

import com.example.botpoc.Entity.BotCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BotConditionRepo extends JpaRepository<BotCondition,Integer> {
//    BotCondition findByName(String name);
}
