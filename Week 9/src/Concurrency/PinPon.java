package Concurrency;

import static java.lang.Thread.sleep;

public class PinPon implements Runnable{
    private String word;
    private int delay;

    public PinPon (String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
    }

    public void run() {
        try {
            for(int i=0; i< 100; i++) {
                System.out.print(word + " ");
                sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println("PigPong2 interrupted: "+ e.getMessage());
            return;
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread (new PinPon ("Ping", 30));
        Thread t2 = new Thread (new PinPon ("Pong", 100));
        t1.start();
        t2.start();
    }
}
