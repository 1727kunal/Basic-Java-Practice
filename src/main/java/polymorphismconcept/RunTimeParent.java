package polymorphismconcept;

public class RunTimeParent {

    void performMultiplication(int a, int b){
        System.out.println("Multiplication of 2 numbers (Parent) = " +(a*b));
    }

    void performDivision(int c, int d){
        System.out.println("Division of 2 numbers (Parent) = " +(c/d));
    }

    static void testStaticMethod(){
        System.out.println("PARENT : Static Method");
    }
}
