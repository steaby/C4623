package io;

public class RunnableEx implements Runnable 
{
    @Override
    public void run() 
    {
        // Code to be executed in the thread
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Thread: " + Thread.currentThread().getId() + ", Count: " + i);
        }
    }


public class Main
{
    public static void main(String[] args) 
    {
        // Create an instance of MyRunnable
        RunnableEx R = new RunnableEx();

        // Create a Thread object with MyRunnable as the target
        Thread thread = new Thread(R);

        // Start the thread
        thread.start();

        // Main thread continues executing
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Main Thread: " + Thread.currentThread().getId() + ", Count: " + i);
        }
    }
}
}


	