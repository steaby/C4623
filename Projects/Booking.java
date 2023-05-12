package com.Hotel.model;


import javax.persistence.*;
@Entity  
@Table(name = "Booking")
public class Booking 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bid")
    private int B_id;

    @Column(name = "Booking_Date")
    private String B_date;

    @Column(name = "FirstName")
    private String firstname;

    @Column(name = "LastName")
    private String lastname;
    
    @Column(name = "Age")
    private int age;
    
    @Column(name = "Status")
    private String status;
    

	public Booking()
	{
		super();
	}

	public Booking(String b_date, String firstname, String lastname, int age, String status) 
	{
		super();
		B_date = b_date;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.status = status;
	}

	public int getB_id()
	{
		return B_id;
	}

	public void setB_id(int b_id)
	{
		B_id = b_id;
	}

	public String getB_date()
	{
		return B_date;
	}

	public void setB_date(String b_date)
	{
		B_date = b_date;
	}

	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}

	public String getLastname() 
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}

	@Override
	public String toString() 
	{
		return "Booking [B_date=" + B_date + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", status=" + status + "]";
	}    
}