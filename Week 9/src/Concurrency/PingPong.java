package Concurrency;

public class PingPong extends Thread{
    String word;
    public PingPong (String whatToSay) {
        word = whatToSay;
    }

    public void run() {
        for(int i=0; i< 100; i++){
            System.out.print(word+ " ");
        }
    }
}

class TestPingPong {
    public static void main(String args[]) {
        PingPong ping = new PingPong("Ping");
        PingPong pong = new PingPong("Pong");
        ping.start();
        pong.start();
    }
}


