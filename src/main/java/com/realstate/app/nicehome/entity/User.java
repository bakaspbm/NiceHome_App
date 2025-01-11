package com.realstate.app.nicehome.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private String name;
    private  String surname;
    private int bday;
    @OneToMany(mappedBy = "user")
    private Set<Properties> properties;



}
