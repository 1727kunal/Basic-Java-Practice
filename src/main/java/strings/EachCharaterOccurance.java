package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class EachCharaterOccurance {
    public static void main(String[] args) {
        String s1 = "One is here and no one is there";
        char [] a1 = s1.toCharArray();
        System.out.println(Arrays.toString(a1));
        ArrayList<Character> l1 = new ArrayList<>();

        for(int i=0; i<a1.length; i++){
            if(!l1.contains(a1[i])){
                int count=0;
                for(int j=0; j<a1.length; j++){
                    if(a1[j]==a1[i]){
                        count++;
                    }
                }
                l1.add(a1[i]);
                System.out.println("Character " + a1[i]+ " is occurred: "+count+" times");
            }
        }
    }
}
