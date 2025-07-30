package interviewprograms;

import java.util.ArrayList;

public class EachCharOccurance {
    public static void main(String[] args) {
        String name ="Kunal Kunal Kunal Kunal Kunal";

        char [] actual =name.toCharArray();
        //System.out.println(Arrays.toString(actual));
        ArrayList<Character> tempArr = new ArrayList<>();

        for(int i=0; i<actual.length; i++){
            if(!tempArr.contains(actual[i])){
                int temp =0;
                for(int j=0; j<actual.length; j++){
                    if(actual[j]==actual[i]){
                        temp++;
                    }
                }
                tempArr.add(actual[i]);
                System.out.println("Occurance of charactet " + actual[i] +" is " + temp);
            }
        }
    }
}
