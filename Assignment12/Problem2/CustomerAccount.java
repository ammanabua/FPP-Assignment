package Assignment.Assignment12.Problem2;

import Assignment.Assignment3.Problem1.Customer;

public class CustomerAccount {
    private String Cus_name;
    private int Acc_No;
    private double Balance;

    public CustomerAccount(String name, int acc_no, double balance){
        Cus_name = name;
        Acc_No = acc_no;
        Balance = balance;
        System.out.println(this.toString());
    }

    public boolean deposit(double amount){
        if (amount > 0){
            Balance += amount;
            System.out.println("Deposit: +$" + amount);
            System.out.println("Current Balance: $" + Balance);
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) throws InsufficientBalanceException, LowBalanceException{
        if (amount < 0){
            return false;
        }

        if (Balance < amount){
            throw new InsufficientBalanceException("Withdrawal amount exceeds current balance! Try lower amount");
        } else if (Balance - amount < 100) {
            throw new LowBalanceException("Your balance will go below $100 after withdrawal. Try lower amount");
        } else {
            System.out.println("Withdrawal: -$" + amount);
            Balance -= amount;
            System.out.println("Current Balance: $" + Balance);
            return true;
        }
    }

    public double getBalance(){
        return Balance;
    }

    @Override
    public String toString(){
        return "New Account: { Name:" + Cus_name + ", Account Number: " + Acc_No + ", Opening Balance: $" + Balance + "}";
    }
}
