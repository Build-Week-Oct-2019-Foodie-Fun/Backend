package com.lambdaschool.starthere.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lambdaschool.starthere.logging.Loggable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Loggable
@Entity
@Table(name = "restaurantreview")
public class RestaurantReview extends Auditable implements Serializable {


    @Id
    @ManyToOne
    @JoinColumn(name = "restaurantid")
    @JsonIgnoreProperties("restaurantreview")
    private Restaurant restaurant;

    @Id
    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("restaurantreview")
    private User user;

    private String review;


    public RestaurantReview() {
    }

    public RestaurantReview(Restaurant restaurant, User user) {
        this.restaurant = restaurant;
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestaurantReview)) return false;
        RestaurantReview that = (RestaurantReview) o;
        return getRestaurant().equals(that.getRestaurant()) &&
                getUser().equals(that.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRestaurant(), getUser());
    }

    @Override
    public String toString() {
        return "RestaurantReview{" +
                "restaurant=" + restaurant +
                ", user=" + user +
                '}';
    }
}
