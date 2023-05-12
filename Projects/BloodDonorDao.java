package com.bloodbank.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bloodbank.model.*;

public class BloodDonorDao 
{
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    
	  public static void saveDonor(BloodDonor donor)
	  {
	    Transaction tx = null;
	    try (Session session = sessionFactory.openSession()) 
	    {
	      tx = session.beginTransaction();
	      session.save(donor);
	      tx.commit();
	    } 
	    catch (Exception e) 
	    {
	      if (tx != null) 
	      {
	        tx.rollback();
	      }
	      e.printStackTrace();
	    }
	  }
	  public static void saveOrUpdateDonor(BloodDonor donor)
	  {
	    Transaction tx = null;
	    try (Session session = sessionFactory.openSession()) 
	    {
	      tx = session.beginTransaction();
	      session.saveOrUpdate(donor);
	      tx.commit();
	    } 
	    catch (Exception e) 
	    {
	      if (tx != null) 
	      {
	        tx.rollback();
	      }
	      e.printStackTrace();
	    }
	  }
	  public static void deletedonor(BloodDonor donor)
	  {
	    Transaction tx = null;
	    try (Session session = sessionFactory.openSession()) 
	    {
	      tx = session.beginTransaction();
	      session.delete(donor);
	      tx.commit();
	    } 
	    catch (Exception e) 
	    {
	      if (tx != null) 
	      {
	        tx.rollback();
	      }
	      e.printStackTrace();
	    }
	  }

}
