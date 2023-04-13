package io;

public class ThreadEx extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread"+Thread.currentThread().getId()+":"+i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	class ThreadExample
	{
	public static void main(String[] args) 
	{
		ThreadEx t1= new ThreadEx();
		ThreadEx t2= new ThreadEx();
		ThreadEx t3= new ThreadEx();
		ThreadEx t4= new ThreadEx();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
	try
	{
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	System.out.println("All threads Finished.");

	}
	}
}
