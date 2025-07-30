package exceptionhandling;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("Handling exception using try-catch block");

        int amount = 2000;
        int balance = 5000;

        if(amount>balance){
            try {
                throw new Exception("Amount is greater than your available balance, please enter correct amount.");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else{
            System.out.println("Take your cash...");
        }

        System.out.println("Your available balance is " + (balance-amount));
    }
}
