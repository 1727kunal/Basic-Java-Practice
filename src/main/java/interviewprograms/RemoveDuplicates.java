package interviewprograms;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr1 = new int [] {5,5,5,2,2,4,5,6,11,11,23,34,56};
        System.out.println("Original Array : " + Arrays.toString(arr1));

        Set <Integer>s1 = new HashSet <Integer>();
        for (int i = 0; i < arr1.length; i++) {
            s1.add(arr1[i]);
        }

        System.out.println("Array with unique elements : "+s1);
    }
}
