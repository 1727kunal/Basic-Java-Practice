package interviewprograms;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber2 {
    public static void main(String[] args) {
        int [] numbers = new int[]{17,20,12,15,18,11,19,13,16,14};
        System.out.println("Array before sorting ---> ");
        for(int n: numbers){
            System.out.print(n+" ");
        }

        Set<Integer> sortedData = new TreeSet<>();
        for(int i : numbers){
            sortedData.add(i);
        }
        System.out.println();
        System.out.println("Array after sorting ---> ");
        System.out.println(sortedData);

        ArrayList<Integer> num = new ArrayList<>(sortedData);
        System.out.println("Second largest number is " +num.get(num.size()-2));
    }
}
