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

    private String restaurantLocation;
    private String restaurantType;
    private String restaurantHours;

    private String restaurantRating;

    public Restaurant() {
    }

    public Restaurant(String restaurantName,
                      String restaurantLocation,
                      String restaurantType,
                      String restaurantHours,
                      String restaurantRating) {


        this.restaurantName = restaurantName;

        this.restaurantLocation = restaurantLocation;
        this.restaurantType = restaurantType;
        this.restaurantHours = restaurantHours;
        this.restaurantRating = restaurantRating;
    }

    public long getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(long restaurantid) {
        this.restaurantid = restaurantid;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public String getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    public String getRestaurantHours() {
        return restaurantHours;
    }

    public void setRestaurantHours(String restaurantHours) {
        this.restaurantHours = restaurantHours;
    }

    public String getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(String restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantid=" + restaurantid +
                ", restaurantName='" + restaurantName + '\'' +
                ", restaurantLocation='" + restaurantLocation + '\'' +
                ", restaurantType='" + restaurantType + '\'' +
                ", restaurantHours='" + restaurantHours + '\'' +
                ", restaurantRating='" + restaurantRating + '\'' +
                '}';
    }
}
