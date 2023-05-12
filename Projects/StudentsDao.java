package com.student.Dao;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.student.model.Students;



public class StudentsDao
{
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    
	  public static void saveStudent(Students st) 
	  {
	    Transaction tx = null;
	    try (Session session = sessionFactory.openSession()) 
	    {
	      tx = session.beginTransaction();
	      session.save(st);
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
	    public static void saveOrUpdateStudent(Students st) 
		  {
		    Transaction tx = null;
		    try (Session session = sessionFactory.openSession()) 
		    {
		      tx = session.beginTransaction();
		      session.saveOrUpdate(st);
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
	    public static void deleteStudent(Students st) 
		  {
		    Transaction tx = null;
		    try (Session session = sessionFactory.openSession()) 
		    {
		      tx = session.beginTransaction();
		      session.delete(st);
		      tx.commit();
		    } 
		    catch (Exception e) {
		    	
		    
		    
		      if (tx != null) 
		      {
		        tx.rollback();
		      }
		      e.printStackTrace();
		    }
		  }
		    


		public static Students getStudentById(int id) 
		{
			 Transaction tx = null;
			 Students data=null;
			    try (Session session = sessionFactory.openSession()) 
			    {
			      tx = session.beginTransaction();
			      data=session.get(Students.class,id);
			      tx.commit();
			    } catch (Exception e) {
			      if (tx != null) {
			        tx.rollback();
			      }
			      e.printStackTrace();
			    }
			    return data;
			  }
		}

