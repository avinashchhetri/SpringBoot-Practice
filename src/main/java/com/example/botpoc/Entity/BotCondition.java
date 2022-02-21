package com.example.botpoc.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class BotCondition {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="\"condition\"")
    String condition;
    String timeFrame;



}
