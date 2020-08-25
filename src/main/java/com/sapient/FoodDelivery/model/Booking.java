package com.sapient.FoodDelivery.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table
public class Booking implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8987153351264103078L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int bookingId;
	@Column
	private int restaurantId;
	@Column
	private String restaurantName;	
	@Column
	@CreatedDate
	private Date bookedOn;
	
	@Column
	private int foodItemId;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
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
	public Date getBookedOn() {
		return bookedOn;
	}
	public void setBookedOn(Date bookedOn) {
		this.bookedOn = bookedOn;
	}
	public int getFoodItemId() {
		return foodItemId;
	}
	public void setFoodItemId(int foodItemId) {
		this.foodItemId = foodItemId;
	}

	
	
	
	
	
	
}
