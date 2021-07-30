package Banking;

public class BankAccount {
    private int balance;
    public BankAccount (int balance) {
        this.balance = balance;
    }

    public void setBalance(AccountHolder c, int newBalance) {
        System.out.println(c.name+ " sets the balance");
        System.out.println("Previous balance is: "+ balance);
        balance = newBalance;
        System.out.println(c.name+ " gets the balance");
        System.out.println("New balance is: "+ balance);
    }
    public int getBalance(AccountHolder c) {
        System.out.println(c.name+ " gets the balance");
        System.out.println("Current balance is: "+ balance);
        return balance;
    }
}

class AccountHolder implements Runnable{
    String name;
    int amount;
    BankAccount bacc;

    public AccountHolder (String name, int amount, BankAccount bacc) {
        this.name = name;
        this.amount = amount;
        this.bacc = bacc;
    }
    public void run() {
        int balance, newBalance;
        balance = bacc.getBalance(this);
        newBalance = balance + amount;
        bacc.setBalance(this, newBalance);
    }
}


class Depositing {
    public static void main(String args[]) {
        BankAccount bankAcc = new BankAccount(1000);
        Thread timothy = new Thread(new AccountHolder("Timothy", 200, bankAcc));
        Thread sue  = new Thread(new AccountHolder("Sue", 150, bankAcc));

        timothy.start();
        sue.start();
    }
}


