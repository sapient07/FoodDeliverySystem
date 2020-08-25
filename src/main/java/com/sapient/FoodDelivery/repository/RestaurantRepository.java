package com.sapient.FoodDelivery.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.FoodDelivery.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
    Page<Restaurant> searchByRating(int restaurantRating, Pageable pageable);
    Page<Restaurant> searchByDestination(String restaurantDestination, Pageable pageable);

}
