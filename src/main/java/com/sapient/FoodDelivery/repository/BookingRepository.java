package com.sapient.FoodDelivery.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.FoodDelivery.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{
    Page<Booking> findByBookingId(int bookingId, Pageable pageable);

}
