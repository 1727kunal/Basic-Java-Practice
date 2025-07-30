package arrayconcepts;

import java.util.Arrays;

public class ArrayPalindromeCheck {
    public static void main(String[] args) {
        int [] arr1 ={1,1,2,2,1,1};
        int [] arr2 = new int [arr1.length];
        System.out.println("Original Array = "+Arrays.toString(arr1));
        for(int i=arr1.length-1, j=0; i>=0; i--,j++){
            arr2[j]=arr1[i];
        }
        System.out.println("Reversed Array = "+ Arrays.toString(arr2));

        int count=0;

        for(int k=0; k<arr2.length; k++){
            if(arr2[k]!=arr1[k]){
                count++;
            }
        }
        System.out.println("Counter Value = " +count);
        if(count!=0)
            System.out.println("Not Palindrome Array");
        else
            System.out.println("Palindrome Array");
    }
}
