package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.Restaurant;
import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.models.UserReview;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService
{
    UserDetails loadUserByUsername(String username);

    List<User> findAll(Pageable pageable);

    List<User> findByNameContaining(String username,
                                    Pageable pageable);

    User findUserById(long id);

    User findByName(String name);

    void delete(long id);

    User save(User user);

    Restaurant addRestaurant(Restaurant restaurant, Long userid);

    void addReview(Long userid, Long restaurantid);


    User update(User user,
                long id,
                boolean isAdmin);

    void deleteUserRole(long userid,
                        long roleid);

    void addUserRole(long userid,
                     long roleid);
}