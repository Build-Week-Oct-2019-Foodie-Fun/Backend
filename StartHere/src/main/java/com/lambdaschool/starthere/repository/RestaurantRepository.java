package com.lambdaschool.starthere.repository;

import com.lambdaschool.starthere.models.Restaurant;
import com.lambdaschool.starthere.view.JustTheCount;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Long> {

    @Query(value = "SELECT COUNT(*) as count FROM restaurantreview WHERE restaurantid = :restaurantid AND userid = :userid",
            nativeQuery = true)
    JustTheCount checkUserReviewCombo(long restaurantid,
                                     long userid);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO restaurantreview(restaurantid, userid) VALUES (:restaurantid, :userid)",
            nativeQuery = true)
    void insertUserReviews(long restaurantid,
                         long userid);
}
