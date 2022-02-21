package com.example.botpoc.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
public class BotSchedule {

    @Id
    @GeneratedValue
    private int id;
    private Long day;

    private String method;
    @Column(name="\"trigger\"")
    private String trigger;
    private  String triggerType;
    private Long week;



}
