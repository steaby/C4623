package com.Hotel.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Hotel.model.Booking;
import com.Hotel.util.HibernateUtil;
import java.util.*;
public class BookingDao implements IBookingDao
{
	public void saveBooking(Booking booking) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            // start the transaction
            transaction = session.beginTransaction();

            // save Booking object
            session.save(booking);

            // commit the transaction
            transaction.commit();
        }
        catch (Exception e) 
        {
            if (transaction != null) 
            {
                transaction.rollback();
            }
        }
    }
	public void updateBooking(Booking booking) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(booking);;

            // commit the transaction
            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
    }
	
	@SuppressWarnings("unchecked")
	public List<Booking> getAllBookings()
	{
		Transaction transaction = null;
		List<Booking> bookings = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			bookings = session.createQuery("from Booking").list();
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
		}
		return bookings;
	}
	
	public void deleteBooking(Booking booking) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            // start the transaction
            transaction = session.beginTransaction();

            // save Booking object
            session.delete(booking);

            // commit the transaction
            transaction.commit();
        }
        catch (Exception e) 
        {
            if (transaction != null) 
            {
                transaction.rollback();
            }
        }
    }
	
}