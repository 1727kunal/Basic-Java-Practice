package strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        PalindromeString obj = new PalindromeString();
//        obj.checkUsingReverseMethod();
        obj.checkUsingLogic();

    }

    String takeUserInput() {
        System.out.println("Enter the string you want to check it is palindrome or not:");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    void checkUsingReverseMethod() {
        //-----------By using build-in method REVERSE of StringBuffer class---------
        String userInput = takeUserInput();
        System.out.println("Actual String is: " + userInput);
        StringBuilder output = new StringBuilder(userInput);
        StringBuilder result = output.reverse();
        String myString;
        myString = new String(result);
        System.out.println("Expected String is: " + myString);
        if (userInput.equals(myString)) {
            System.out.println("Given string is palindrome...");
        } else {
            System.out.println("Given string is not palindrome...");
        }
    }

    void checkUsingLogic() {
        String actualString = takeUserInput();
        System.out.println("Actual String is: " + actualString);
        char[] actualArray = actualString.toCharArray();

        int inputLength = actualString.length();

        char[] expectedArray = new char[inputLength];
        int tempIndex = 0;
        for (int i = inputLength - 1; i >= 0; i--) {
            expectedArray[tempIndex] = actualArray[i];
            tempIndex++;
        }

        String expectedString = new String(expectedArray);
        System.out.println("Expected String is: " + expectedString);
        if (actualString.equals(expectedString)) {
            System.out.println("Given string is palindrome...");
        } else {
            System.out.println("Given string is not palindrome...");
        }
    }
}
