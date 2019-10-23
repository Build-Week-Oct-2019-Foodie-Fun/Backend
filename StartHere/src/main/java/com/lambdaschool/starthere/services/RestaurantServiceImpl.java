package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.Restaurant;
import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.repository.RestaurantRepository;
import com.lambdaschool.starthere.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Service(value = "restaurantService")
public class RestaurantServiceImpl implements RestaurantService {

    //@Autowired
    //private UserService userservice;

    @Autowired
    private RestaurantRepository restrepos;

    @Override
    public List<Restaurant> findAll() {
        List<Restaurant> rtnList = new ArrayList<>();
        restrepos.findAll()
                .iterator()
                .forEachRemaining(rtnList::add);
        return rtnList;
    }

    @Transactional
    @Override
    public Restaurant save(Restaurant restaurant, Long userid) {

        //User currentuser = userservice.findUserById(userid);

        Restaurant newRestaurant = new Restaurant();

        newRestaurant.setRestaurantName(restaurant.getRestaurantName());
        newRestaurant.setRestaurantLocation(restaurant.getRestaurantLocation());
        newRestaurant.setRestaurantHours(restaurant.getRestaurantHours());
        newRestaurant.setRestaurantType(restaurant.getRestaurantType());
        newRestaurant.setRestaurantRating(restaurant.getRestaurantRating());

        //newRestaurant.setUser(currentuser);

        //return restrepos.save(newRestaurant);
        return null;
    }



    @Override
    public Restaurant update(Restaurant restaurant, long id) {
        //send in old and new data

        return restrepos.save(restaurant);
    }

    @Override
    public void delete(long id) {
        restrepos.deleteById(id);
    }
}
