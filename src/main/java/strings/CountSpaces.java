package strings;

import java.util.Arrays;

public class CountSpaces {

    static int spaceCounter=0;

    public static void main(String[] args) {
        CountSpaces obj = new CountSpaces();
        obj.performSpaceCount();
    }

    void performSpaceCount(){
        String actualString = "K U N A L 1 7 2 7";
        char [] actualStrArr = actualString.toCharArray();

        for(int i=0; i<actualString.length(); i++){
            if(Character.isWhitespace(actualStrArr[i])){
                spaceCounter++;
            }
        }
        System.out.println("Total number of spaces in given string is = " +spaceCounter);
    }
}
