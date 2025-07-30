package polymorphismconcept;

public class CompileTimeDemo1 {

    public static void main(String[] args) {
        /*
            1. Compile time polymorphism achieved using method overloading
            2. Based on arguments passed to methods, it has been achieved
         */
        CompileTimeDemo1 ref = new CompileTimeDemo1();
        ref.performAddition(10, 20);
        ref.performAddition(10, 20, 30);
    }

    void performAddition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
    }

    void performAddition(int a, int b, int c) {
        System.out.println("Addition of " + a + " and " + b + " and " + c + " is " + (a + b + c));
    }
}
