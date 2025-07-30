package strings;

public class CheckCharOccurrence {
    static int counter=0;

    public static void main(String[] args) {

        String actualString = "Kunal Waghamare, Deshmukhwadi, Shivane";
        System.out.println("Actual string is: " +actualString);
        int strLength = actualString.length();
        for (int i = 0; i < strLength; i++) {
            if(actualString.charAt(i)=='a')
            {
                counter++;
            }
        }
        System.out.println("The occurrence of character a is = "+counter);
    }
}
