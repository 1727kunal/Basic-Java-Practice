package strings;

public class CountAlphabets {
    static int alphaCount = 0;

    public static void main(String[] args) {
        CountAlphabets obj = new CountAlphabets();
        obj.performCount();
    }

    void performCount() {

        String actualString = "k m w 1727";
        System.out.println("Actual string is: " + actualString);

        char[] inputStringArr = actualString.toCharArray();
        for (int i = 0; i < inputStringArr.length; i++) {
            if (Character.isAlphabetic(inputStringArr[i])) {
                alphaCount++;
            }
        }
        System.out.println("Total number of alphabets present in the given string is = " + alphaCount);
    }
}
