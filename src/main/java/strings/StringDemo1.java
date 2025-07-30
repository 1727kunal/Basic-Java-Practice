package strings;


public class StringDemo1 {

    public static void main(String[] args) {
        String s = "Kunal Milind Waghamare";
        System.out.println(s.contains("Mil"));  //true
        System.out.println(s.concat(" 1727")); //kunal waghamare 1727
        System.out.println(s.substring(0, 5));   //Kunal
        System.out.println(s.substring(6, 12));  //Milind
        System.out.println(s.substring(13));    //Waghamare
        System.out.println(s.endsWith("mare"));


        String message = "Your OTP is 45678";
        System.out.println("OTP = " + message.substring(message.indexOf('4')));
    }
}
