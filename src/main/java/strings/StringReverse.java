package strings;

public class StringReverse {
    public static void main(String[] args) {
        StringReverse ref = new StringReverse();
        ref.performReverse();
    }

    void performReverse() {
        PalindromeString ref = new PalindromeString();
        String actualString = ref.takeUserInput();
        System.out.println("Actual string is: " + actualString);
        String expectedString = "";

        int requiredIndex = actualString.length();
        for (int i = requiredIndex - 1; i >= 0; i--) {
            expectedString += actualString.charAt(i);
//            expectedString = expectedString.concat(String.valueOf(actualString.charAt(i)));
        }
        System.out.println("Expected string is: " + expectedString);

        //Logic to check palindrome...
        if (actualString.equals(expectedString)) {
            System.out.println("Given string is palindrome...");
        } else {
            System.out.println("Given string is not palindrome...");
        }
    }
}
