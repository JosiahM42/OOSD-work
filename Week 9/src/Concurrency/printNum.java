package Concurrency;

import static java.lang.Thread.sleep;
import java.util.Scanner;

public class printNum implements Runnable{
    private int numThread;

    public printNum (int numThreads) {
        numThread = numThreads;
    }

    public void run() {
        try {
            for(int i=0; i<= numThread; i++) {
                System.out.print("Hi, I am Thread #" + i +"\n");
                sleep(numThread);
            }
        } catch (InterruptedException e) {
            System.out.println("PigPong2 interrupted: "+ e.getMessage());
            return;
        }
    }

    public static void main(String[] args) {
        Scanner thread = new Scanner(System.in);// Create a Scanner object
        System.out.println("Enter number of threads you wish to create: ");
        int userNumber = thread.nextInt();

        Thread t1 = new Thread (new printNum (userNumber));

        t1.start();
    }
}
