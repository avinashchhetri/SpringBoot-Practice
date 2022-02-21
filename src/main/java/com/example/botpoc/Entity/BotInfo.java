package com.example.botpoc.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class BotInfo {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    private String botType;
    private String clientId;
    private String clientSecret;

    @OneToMany(targetEntity = BotSchedule.class, cascade = CascadeType.ALL)
    @JoinColumn(name="botinfo_fk", referencedColumnName = "id")
    private List<BotSchedule> methods;
    private String tenantId;
    private String title;


}
