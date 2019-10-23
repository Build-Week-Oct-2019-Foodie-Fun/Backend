package com.lambdaschool.starthere.repository;

import com.lambdaschool.starthere.models.Restaurant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Long> {


}
