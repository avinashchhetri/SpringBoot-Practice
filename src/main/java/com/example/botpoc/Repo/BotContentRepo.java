package com.example.botpoc.Repo;

import com.example.botpoc.Entity.BotContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotContentRepo extends JpaRepository<BotContent,Integer> {
}
