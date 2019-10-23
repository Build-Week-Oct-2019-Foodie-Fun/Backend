package com.lambdaschool.starthere.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @ApiModelProperty(hidden = true)
    @ManyToOne
    @JoinColumn(name = "userid",
                nullable = false)
    @JsonIgnoreProperties({"restaurants", "userroles", "reviews"})
    private User user;

    @OneToMany(mappedBy = "restaurant",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnoreProperties("restaurants")
    private List<UserReview> userreviews = new ArrayList<>();


    public Restaurant() {
    }

    public Restaurant(User user,
                    String restaurantName,
                      String restaurantLocation,
                      String restaurantType,
                      String restaurantHours,
                      String restaurantRating) {


        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
