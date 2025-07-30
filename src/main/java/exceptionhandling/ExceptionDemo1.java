package exceptionhandling;
import java.lang.Exception;
public class ExceptionDemo1 {
    public static void main(String[] args) throws Exception{
        System.out.println("Declaring the exception using THROWS...");
        int i = 12;
        if(i<18){
            throw new Exception("Not eligible for voting...");
        }
        System.out.println("You are eligible for voting");
    }
}
