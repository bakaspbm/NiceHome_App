package com.realstate.app.nicehome.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Property_images {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Properties properties;
    private String url;
    private boolean is_cover;
    private Date created_at;

}
