import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getBalance() {
        System.out.println("getBalance");
        Account instance = new Account();
        double expResult = 0.0;
        double result =  instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    void deposit() {
        System.out.println("deposit");
//        double amount = 0.0;
        double amount = 200.0;
        Account instance = new Account();
        instance.deposit(amount);
        double balance =  instance.getBalance();
        assertEquals(amount, balance, 0.0);
    }

    @Test
    void withdraw() {
        System.out.println("withdraw");
//        double amount = 0.0;
        double amount = 200.0;
        Account instance = new Account();
        instance.deposit(400);
        instance.withdraw(amount);
        double balance =  instance.getBalance();
        assertEquals(amount, balance, 0.0);
        System.out.println(balance);
    }
}