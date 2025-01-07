package com.realstate.app.nicehome.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Time;
import java.util.Date;
@Data
@Entity
public class Rentals {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
     private   User user;
     private   Properties properties;
     private Time start_date;
     private Date end_date;
   //  private Status status;
     private Date created_at;


}
