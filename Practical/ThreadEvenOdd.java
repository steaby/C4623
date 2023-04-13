package io;

public class ThreadEvenOdd
{
    public static void main(String[] args)
    {
        Thread evenThread = new Thread(new EvenRunnable());
        Thread oddThread = new Thread(new OddRunnable());

        evenThread.start();
        oddThread.start();
    }

    private static class EvenRunnable implements Runnable {
        @Override
        public void run() 
        {
            for (int i = 2; i <= 10; i += 2)
            {
                System.out.println(i);
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class OddRunnable implements Runnable {
        @Override
        public void run()
        {
            for (int i = 1; i <= 9; i += 2)
            {
                System.out.println(i);
                try
                {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}


