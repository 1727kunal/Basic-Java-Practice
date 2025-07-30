package exceptionhandling;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try{
            System.out.println("Try");
            int a = 2/0;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Catch");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
