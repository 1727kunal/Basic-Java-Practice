package testorg.homework;

import java.util.Scanner;

public class KeywordAssert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : " );
        int age = sc.nextInt();
        sc.close();
        assert age>=18:"Sorry condition for age doesn't met..";
        System.out.println("You are eligible for voting...");
    }
}
