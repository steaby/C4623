package com.Hotel.dao;
import com.Hotel.model.Booking;
import java.util.*;
public interface IBookingDao 
{
	void saveBooking(Booking booking);

	void updateBooking(Booking booking);
	
	List<Booking> getAllBookings();

	void deleteBooking(Booking booking);

}
