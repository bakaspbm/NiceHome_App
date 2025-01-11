package com.realstate.app.nicehome.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Properties {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;

    private int price ;


    private int bedrooms;
    private int bathrooms;
    private int garage_spaces;
    @Enumerated(EnumType.STRING)
   private Availability availability;
    @OneToOne
    @JoinColumn(name = "address")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private Date created_at;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany
    @JoinColumn(name = "propriety_images")
    private Set<Property_images> images;
    @OneToOne
    private Rentals rentals;

}
