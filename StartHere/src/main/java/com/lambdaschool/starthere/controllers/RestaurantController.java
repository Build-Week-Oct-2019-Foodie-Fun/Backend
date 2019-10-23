package com.lambdaschool.starthere.controllers;

import com.lambdaschool.starthere.models.Restaurant;
import com.lambdaschool.starthere.services.RestaurantService;
import org.slf4j.ILoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
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

//    // POST http://localhost:2019/restaurants/newrestaurant
//    @PostMapping(value = "/newrestaurant",
//                consumes = {"application/json"},
//                produces = {"application/json"})
//    public ResponseEntity<?> addNewRestaurant(HttpServletRequest request,
//                                                                     @Valid
//                                                                     @RequestBody
//                                                                             Restaurant newrestaurant) throws URISyntaxException
//    {
//        logger.trace(request.getMethod()
//                .toUpperCase() + " " + request.getRequestURI() + " accessed");
//
//        newrestaurant = restaurantService.save(newrestaurant);
//
//        // set the location header for the newly created resource
//        HttpHeaders responseHeaders = new HttpHeaders();
//        URI newUserURI = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{restaurantid}")
//                .buildAndExpand(newrestaurant.getRestaurantid())
//                .toUri();
//        responseHeaders.setLocation(newUserURI);
//
//        return new ResponseEntity<>(null,
//                responseHeaders,
//                HttpStatus.CREATED);
//    }
}
