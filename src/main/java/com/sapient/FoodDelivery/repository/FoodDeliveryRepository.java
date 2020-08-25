package com.sapient.FoodDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.FoodDelivery.model.FoodItem;

public interface FoodDeliveryRepository extends JpaRepository<FoodItem, Long>{

}
