package DesignPatterns;

class Singleton {

    private int i;

    private Singleton(int x) {
        i = x;
    }
//    private static Singleton s = new Singleton(50);
    private static Singleton s;

    public static Singleton getInstance() {
        if (s==null){
            s = new Singleton(60);
        }
        return s;
    }

    public int getValue() {
        return i;
    }

    public void setValue(int x) {
        i = x;
    }
}

public class SingletonPattern {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getValue());
        Singleton s2 = Singleton.getInstance();
        s2.setValue(30);
        System.out.println(s.getValue());
        System.out.println(s.toString());
        System.out.println(s2.toString());


        try {
            Singleton s3 = s2;
            System.out.println(s3.getValue());
            System.out.println(s3.toString());

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
