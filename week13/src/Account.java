public class Account {
    double balance;

    public Account(){
        balance = 0.0;
    }

    public double getBalance(){
        return balance ;
    }

//    public void deposit(double amount){
//        balance = balance + amount;
//    }
//
//    public void withdraw(double amount){
//        balance = balance - amount;
//    }

    public boolean deposit(double amount)
    {
        boolean result = true;
        // check if the amount is valid
        if (amount < 0)
        {
            result = false;
        }
        else
        {
            balance = balance + amount;
        }

        return result;
    }


    public boolean withdraw(double amount)
    {
        boolean result = true;
        // validate parameters
        if (amount > 0 && amount <= balance)
        {
            balance = balance - amount;
        }
        else
        {
            result = false;
        }

        return result;
    }


}
