package com.lambdaschool.starthere.controllers;

import com.lambdaschool.starthere.models.Restaurant;
import com.lambdaschool.starthere.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    // GET http://localhost:2019/restaurants/restaurants
    @GetMapping(value = "/restaurants",
            produces = {"application/json"})
    public ResponseEntity<?> listAllRestaurants() {

        List<Restaurant> restaurantList = restaurantService.findAll();
        return new ResponseEntity<>(restaurantList, HttpStatus.OK);
    }
}
