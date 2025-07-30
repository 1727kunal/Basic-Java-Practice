package testorg.homework;

public class ConceptConstructor {

    ConceptConstructor(){
        System.out.println("Non-Parameterized Constructor");
    }
    void firstMethod(){
        System.out.println("Non- static Method");
    }
    static void secondMethod(){
        System.out.println("Static Method");
    }
    public static void main(String[] args) {
        secondMethod();
        ConceptConstructor obj = new ConceptConstructor();
        obj.firstMethod();
    }
}
