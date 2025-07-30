package strings;

import java.util.Arrays;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 123210;
        String expected ="";

        String actual = String.valueOf(num);
        System.out.println("Actual Number = " +actual);

        char [] arr = actual.toCharArray();

        for (int i = arr.length-1; i>=0 ; i--) {
            expected += arr[i];
        }
        System.out.println("Expected Number = " +expected);
        if(actual.equals(expected)){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
