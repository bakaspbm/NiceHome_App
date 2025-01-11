package com.realstate.app.nicehome.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
private Integer id;
private String country;
private String city;
private String numbPropriety;
private String street;

@OneToOne
private Properties properties;

}
