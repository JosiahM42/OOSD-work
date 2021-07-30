package Concurrency;

public class PingPong2 extends Thread {
    String word;
    int delay;

    public PingPong2 (String whatToSay, int delayTime) {
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
}

class TestPingPong2 {
    public static void main(String[] args) {
        PingPong2 ping = new PingPong2("Ping", 30);
        PingPong2 pong = new PingPong2("Pong", 100);
        ping.start();
        pong.start();
    }
}

