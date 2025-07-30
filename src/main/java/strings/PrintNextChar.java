package strings;

public class PrintNextChar {
    public static void main(String[] args) {
        String myName = "KuNaL";
        System.out.println("Actual String: " +myName);
        String expectedName ="";

        for (int i = 0; i < myName.length(); i++) {
            int currentChar = myName.charAt(i);
            currentChar++;
            char expectedChar = (char) currentChar;
            expectedName+= expectedChar;
        }
        System.out.println("Expected String: " +expectedName);
    }
}
