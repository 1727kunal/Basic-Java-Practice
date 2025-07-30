package polymorphismconcept;

public class RunTimeChild extends RunTimeParent {
    public static void main(String[] args) {
        RunTimeChild c1 = new RunTimeChild();
        c1.performMultiplication(10,10);
        c1.performDivision(10,10);
        System.out.println("---------------------------------------------------------------");

        System.out.println("This is happened through upcasting...");
        RunTimeParent p1 = new RunTimeChild(); //Upcasting
        p1.performMultiplication(20,10);
        p1.performDivision(20,10);
        System.out.println("---------------------------------------------------------------");

        RunTimeParent p2 = new RunTimeParent();
        p2.performMultiplication(30,10);
        p2.performDivision(30,10);
        System.out.println("---------------------------------------------------------------");

        System.out.println("This is happened through downcasting...");
        RunTimeChild c2 = (RunTimeChild) p1;
        c2.performMultiplication(40,10);
        c2.performDivision(40,10);
        System.out.println("---------------------------------------------------------------");

        System.out.println("Overriding the static method");
        System.out.println("Overriding the static method by creating child object and child reference");
        RunTimeChild c11 = new RunTimeChild();
        c11.testStaticMethod();
        System.out.println("---------------------------------------------------------------");

        System.out.println("Overriding the static method by creating child object and parent reference");
        RunTimeParent p11 = new RunTimeChild();
        p11.testStaticMethod();
        System.out.println("---------------------------------------------------------------");

        System.out.println("Overriding the static method by creating parent object and parent reference");
        RunTimeParent p22 = new RunTimeParent();
        p22.testStaticMethod();

    }

    @Override
    void performMultiplication(int a, int b) {
//        super.performMultiplication(a,b);
        System.out.println("Multiplication of 2 numbers (Child) = " +(a*b));
    }

    @Override
    void performDivision(int c, int d) {
//        super.performDivision(c,d);
        System.out.println("Division of 2 numbers (Child) = " +(c/d));
    }

    static void testStaticMethod(){
        System.out.println("CHILD : Static Method");
    }
}
