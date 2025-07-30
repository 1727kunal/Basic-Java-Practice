package starpatterns;

import java.util.Scanner;

public class PrintTriangle3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= scr.nextInt();
        scr.close();

        for (int i = 1; i <=rows; i++) {
            for (int j = rows-1; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
