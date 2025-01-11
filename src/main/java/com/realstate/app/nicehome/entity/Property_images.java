package com.realstate.app.nicehome.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Property_images {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String url;
    private boolean is_cover;
    private Date created_at;
    @ManyToOne
    @JoinColumn(name = "images")
    private Properties properties;



}
