package com.lambdaschool.starthere.models;

import javax.persistence.*;

@Entity
@Table(name = "restaurants")
public class Restaurant extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long restaurantid;

    @Column(unique = true,
            nullable = false)
    private String restaurantName;

    private String restaurantAddress;
    private String restaurantType;
    private String restaurantHours;

    private String restaurantRating;
    private String restaurantReview;






}
