package Week17;

import java.util.Scanner;

class Currency {
    private int amount;

    public Currency(int amount){
        this.amount=amount;
    }

    public int getAmount(){
        return amount;
    }
}


interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}

class GBP100Dispenser implements DispenseChain {
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain=nextChain;
    }
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 100){
            int num = cur.getAmount()/100;
            int remainder = cur.getAmount() % 100;
            System.out.println("Dispensing "+num+" 100£ note");
            if(remainder !=0)
                chain.dispense(new Currency(remainder));
        }else
        {
            chain.dispense(cur);
        }
    }
}

class GBP50Dispenser implements DispenseChain {
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain=nextChain;
    }
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 50){
            int num = cur.getAmount()/50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50£ note");
            if(remainder !=0)
                chain.dispense(new Currency(remainder));
        }else
        {
            chain.dispense(cur);
        }
    }
}

class GBP20Dispenser implements DispenseChain{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain=nextChain;
    }
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 20){
            int num = cur.getAmount()/20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing "+num+" 20£ note");
            if(remainder !=0)
                chain.dispense(new Currency(remainder));
        }else{
            chain.dispense(cur);
        }
    }
}


class GBP10Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain=nextChain;
    }
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing "+num+" 10£ note");
            if(remainder !=0)
                chain.dispense(new Currency(remainder));
        }else{
            chain.dispense(cur);
        }
    }
}

class GBP5Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain=nextChain;
    }
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 5){
            int num = cur.getAmount()/5;
            int remainder = cur.getAmount() % 5;
            System.out.println("Dispensing "+num+" 5£ note");
            if(remainder !=0)
                chain.dispense(new Currency(remainder));
        }else{
            chain.dispense(cur);
        }
    }
}


class DispenseChainFactory{
    public static DispenseChain getDispenseChain(){
        DispenseChain c1;
        // initialize the chain
//        c1 = new GBP10Dispenser();
//        DispenseChain c2 = new GBP20Dispenser();
//        DispenseChain c3 = new GBP50Dispenser();

        c1 = new GBP100Dispenser();
        DispenseChain c2 = new GBP50Dispenser();
        DispenseChain c3 = new GBP20Dispenser();
        DispenseChain c4 = new GBP10Dispenser();
        DispenseChain c5 = new GBP5Dispenser();
        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(c5);
        return (c1);
    }

}


public class ATMDispenseChain {
    public static void main(String[] args) {
        DispenseChain atmDispenser = DispenseChainFactory.getDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 5 != 0) {
                System.out.println("Amount should be multiple of 5s.");
                return;
            }
            // process the request
            atmDispenser.dispense(new Currency(amount));
        }
    }
}