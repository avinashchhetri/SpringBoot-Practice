package com.example.botpoc.Entity;

import lombok.Data;
import org.hibernate.annotations.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@SQLDelete(sql = "UPDATE bot_condition SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
@Table(name="BOTCONDITION_TABLE")
public class BotCondition {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="\"condition\"")
    String condition;
    String timeFrame;

    private boolean deleted = Boolean.FALSE;

    @CreatedDate
    private Date createDate;
    @LastModifiedDate
    private Date lastModifiedDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String modifiedBy;



}
