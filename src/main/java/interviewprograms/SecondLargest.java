package interviewprograms;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr1 = new int [] {9,8,1,2,3,5,4};
        System.out.println("Original Array : " + Arrays.toString(arr1));

        int temp=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j <arr1.length ; j++) {
                if(arr1[j]<arr1[i]){
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array : " + Arrays.toString(arr1));
        System.out.println("Second largest number in array is : " + arr1[arr1.length-2]);
    }
}
