package com.realstate.app.nicehome.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;
@Data
@Entity
public class Rentals {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;


     private Time start_date;
     private Date end_date;
   //  private Status status;
     private Date created_at;
     @ManyToOne
     @JoinColumn(name = "user_id")
    private   User user;

     @OneToOne
     @JoinColumn(name = "properties_id")
    private   Properties properties;

}
