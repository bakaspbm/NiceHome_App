package com.realstate.app.nicehome.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class Properties {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;
    private Address address;
    private int price ;
    private Type type;
    private Category category;
    private int bedrooms;
    private int bathrooms;
    private int garage_spaces;

  //  private Availability availability;
    private Date created_at;
    private User user;

}
