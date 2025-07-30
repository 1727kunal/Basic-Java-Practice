package arrayconcepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array...");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String [] arr1 = new String [size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the value at index " +i+ " of first array");
            arr1[i]=sc.next();
        }
        System.out.println(Arrays.toString(arr1));
        String [] arr2 = new String [size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the value at index " +i+ " of second array");
            arr2[i]=sc.next();
        }
        sc.close();
        System.out.println(Arrays.toString(arr2));

        int count=0;
        for(int i=0; i<size; i++){
            if(!arr1[i].equals(arr2[i])){
                count++;
            }
        }
        if(count==0){
            System.out.println("1st Logic ---> Both arrays are equal...");
        }
        else{
            System.out.println("1st Logic ---> Both arrays are NOT equal...");
        }

        int [] a1 = {2,3,4};
        int [] a2 = {2,3,5};

        if(Arrays.equals(a1,a2)){
            System.out.println("2nd using built in method ---> Both arrays are equal...");
        }
        else{
            System.out.println("2nd using built in method ---> Both arrays are NOT equal...");
        }
    }
}
