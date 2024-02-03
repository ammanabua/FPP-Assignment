package Assignment.Assignment12.Problem2;

public class Main {
    public static void main(String[] args) {
        CustomerAccount cust = new CustomerAccount("James Cameron", 259395, 580);

        try{
            cust.deposit(200);

            cust.withdraw(600);

        } catch (InsufficientBalanceException | LowBalanceException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
