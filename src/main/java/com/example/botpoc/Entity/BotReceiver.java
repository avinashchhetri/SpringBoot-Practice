package com.example.botpoc.Entity;

import lombok.Data;
import org.hibernate.annotations.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
//@SQLDelete(sql="UPDATE bot_receiver SET  deleted = true  WHERE id=?")
//<strong>@FilterDef(name = "deletedBotReceiverFilter",parameters = @ParamDef(name="isDeleted", type = "boolean"))
//@Filter(name = "deletedBotReceiverFilter", condition = "deleted= :isDeleted")</strong>
public class BotReceiver {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    String userId;

//    private boolean deleted = Boolean.FALSE;

}
//@SQLDelete(sql = "UPDATE tbl_products SET deleted = true WHERE id=?")
//<strong>@FilterDef(name = "deletedProductFilter", parameters = @ParamDef(name = "isDeleted", type = "boolean"))
//@Filter(name = "deletedProductFilter", condition = "deleted = :isDeleted")</strong>
