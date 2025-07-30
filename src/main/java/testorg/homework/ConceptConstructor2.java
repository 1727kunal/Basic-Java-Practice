package testorg.homework;

public class ConceptConstructor2 {

    ConceptConstructor2(){
        System.out.println("Non-parameterized Constructor");
    }

    ConceptConstructor2(int a){
        System.out.println("Parameterized Constructor and value of a is : " +a);
    }

    void firstMethod(){
        System.out.println("Non-parameterized and non-static method");
    }
    void firstMethod(String fullName){
        System.out.println("Parameterized and non-static method and first name is : " + fullName);
    }

    static void secondMethod(){
        System.out.println("Non-parameterized and static method");
    }
    static void secondMethod(boolean isMarried){
        System.out.println("Parameterized and static method and marital status is : " + isMarried);
    }

    public static void main(String[] args) {
        ConceptConstructor2 ref = new ConceptConstructor2();
        ConceptConstructor2 ref2 = new ConceptConstructor2(34);

        ref.firstMethod();
        ref.firstMethod("Kunal Waghamare");

        secondMethod();
        secondMethod(true);
    }
}
