package com.example.botpoc.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class BotReceiver {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    String userId;

}
