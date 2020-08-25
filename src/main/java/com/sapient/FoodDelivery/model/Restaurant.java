package com.sapient.FoodDelivery.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Restaurant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1836227532153628940L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int restaurantId;
	@Column
	private String restaurantName;
	@Column
	private String destination;
	@Column
	private int rating;
	
	@OneToMany(mappedBy="restaurant")
	private List<FoodItem> foodItem;

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantDestination() {
		return destination;
	}

	public void setRestaurantDestination(String restaurantDestination) {
		this.destination = restaurantDestination;
	}

	public int getRestaurantRating() {
		return rating;
	}

	public void setRestaurantRating(int restaurantRating) {
		this.rating = restaurantRating;
	}

	public List<FoodItem> getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(List<FoodItem> foodItem) {
		this.foodItem = foodItem;
	}

	

	
	
	
}
