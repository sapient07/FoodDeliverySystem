package com.sapient.FoodDelivery.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sapient.FoodDelivery.model.Booking;
import com.sapient.FoodDelivery.model.Destination;
import com.sapient.FoodDelivery.model.Restaurant;
import com.sapient.FoodDelivery.repository.BookingRepository;
import com.sapient.FoodDelivery.repository.DestinationRepository;
import com.sapient.FoodDelivery.repository.FoodDeliveryRepository;
import com.sapient.FoodDelivery.repository.RestaurantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodDeliveryController {

	@Autowired
	FoodDeliveryRepository foodDeliveryRepository;
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	DestinationRepository destinationRepository;
	
	@Autowired
	RestaurantRepository restaurantRepository;
	
	/**
	 * @author Rajesh
	 * @param pageable
	 * @return
	 */
	@GetMapping("/destination")
    public Page<Destination> getAllDestinations(Pageable pageable) {
        return destinationRepository.findAll(pageable);
    }
	
	/**
	 * @author Rajesh
	 * @param destination
	 * @return
	 */
	@PostMapping("/destination")
    public Destination createDestination(@RequestBody Destination destination) {
        return destinationRepository.save(destination);
    }
	
	/**
	 * @author Rajesh
	 * @param bookingId
	 * @param pageable
	 * @return
	 */
	@GetMapping("/booking/{bookingId}")
    public Page<Booking> getBookingInfo(@PathVariable (value = "bookingId") int bookingId,
    		Pageable pageable) {
        return bookingRepository.findByBookingId(bookingId, pageable);
    }
	/**
	 * @author Rajesh
	 * @param booking
	 * @return
	 */
	@PostMapping("/booking")
    public Booking createFoodBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }
	
	/**
	 * @author Rajesh
	 * @param searchBy
	 * @param searchValue
	 * @param pageable
	 * @return
	 */
	@GetMapping("/search/{searchBy}/{searchValue}")
	public Page<Restaurant> getRestaurant(@PathVariable (value = "searchBy") String searchBy,
	@PathVariable (value = "searchValue") String searchValue,
    		Pageable pageable) {
		if("rating".equalsIgnoreCase(searchBy)) {
			return restaurantRepository.searchByRating(Integer.valueOf(searchValue), pageable);
		}else {
	        return restaurantRepository.searchByDestination(searchValue, pageable);
		}
	}
	
	
}
