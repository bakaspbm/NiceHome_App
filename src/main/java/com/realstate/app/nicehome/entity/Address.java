package com.realstate.app.nicehome.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
private Integer id;
private String country;
private String city;
private String numPropriete;
private String street;
}
