package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.Restaurant;
import com.lambdaschool.starthere.models.User;

import java.util.List;

public interface RestaurantService {

    List<Restaurant> findAll();

    Restaurant save(Restaurant restaurant, Long userid);

    Restaurant update(Restaurant restaurant,
                      long id);

    void delete(long id);
}
