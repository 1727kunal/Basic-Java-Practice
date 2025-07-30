package strings;


public class CountOccurrence {
    static int lowerCount=0;
    static int upperCount=0;
    static int spaceCount=0;
    static int specialCount=0;
    static int numberCount=0;

    public static void main(String[] args) {
        CountOccurrence obj = new CountOccurrence();
        obj.performOccurrenceCount();
    }

    void performOccurrenceCount(){
        String actualString = "Kunal @ 1992 # Harsha @ 1988";
        System.out.println("Actual String: " +actualString);
        char [] actualArr = actualString.toCharArray();
        for (int i = 0; i < actualString.length(); i++) {
            if(Character.isLowerCase(actualArr[i])){
                lowerCount++;
            } else if (Character.isUpperCase(actualArr[i])) {
                upperCount++;
            } else if (Character.isDigit(actualArr[i])) {
                numberCount++;
            } else if (Character.isWhitespace(actualArr[i])){
               spaceCount++;
            } else if(!Character.isLetterOrDigit(actualArr[i]) && !Character.isWhitespace(actualArr[i])){
                specialCount++;
            }
        }
        System.out.println("Total number of lower case characters is =" +lowerCount);
        System.out.println("Total number of upper case characters is =" +upperCount);
        System.out.println("Total number of digits is =" +numberCount);
        System.out.println("Total number of spaces is =" +spaceCount);
        System.out.println("Total number of special characters is =" +specialCount);
    }
}
