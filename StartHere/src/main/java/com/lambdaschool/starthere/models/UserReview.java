package com.lambdaschool.starthere.models;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class UserReview extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userreviewid;

    private String cuisineType;
    private String menuItem;
    private String itemPrice;
    private String itemRating;

    @Column(name = "reviews")
    private String itemReview;


    @ManyToOne
    @JoinColumn(name = "restaurantid")
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    public UserReview(String cuisineType,
                      String menuItem,
                      String itemPrice,
                      String itemRating,
                      String itemReview) {

        this.cuisineType = cuisineType;
        this.menuItem = menuItem;
        this.itemPrice = itemPrice;
        this.itemRating = itemRating;
        this.itemReview = itemReview;
    }

    public UserReview() {

    }

    public long getUserreviewid() {
        return userreviewid;
    }

    public void setUserreviewid(long userreviewid) {
        this.userreviewid = userreviewid;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemRating() {
        return itemRating;
    }

    public void setItemRating(String itemRating) {
        this.itemRating = itemRating;
    }

    public String getItemReview() {
        return itemReview;
    }

    public void setItemReview(String itemReview) {
        this.itemReview = itemReview;
    }

    @Override
    public String toString() {
        return "UserReview{" +
                "userreviewid=" + userreviewid +
                ", cuisineType='" + cuisineType + '\'' +
                ", menuItem='" + menuItem + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                ", itemRating='" + itemRating + '\'' +
                ", itemReview='" + itemReview + '\'' +
                '}';
    }
}
