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

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table
public class FoodItem implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6605548159813124123L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int foodId;
	@Column
	private String foodName;
	@Column
	private double foodPrice;
	
	
	@ManyToOne
    @JoinColumn(name="restaurant_id", nullable=false)
	private Restaurant restaurant;
	
	
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	
	
}
