package interviewprograms;

public class CheckPalindromeNumber {

    public static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int revNum=0;

        while (temp!=0){
            int rem = temp%10;
            revNum = revNum *10 + rem;
            temp = temp/10;
        }
        System.out.println("Original Number = " + num);
        System.out.println("Reversed Number = " + revNum);

        if(num==revNum){
            System.out.println("Number is Palindrome...");
        }
        else {
            System.out.println("Number is not Palindrome...");
        }
    }
}
