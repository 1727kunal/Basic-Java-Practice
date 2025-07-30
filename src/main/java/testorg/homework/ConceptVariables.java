package testorg.homework;

public class ConceptVariables {
    static int a=10;
    static int b=20;
    int c=100;
    int d=200;

    void add(){
        System.out.println(a+b);
    }

    static void sub(){
        System.out.println(b-a);
        ConceptVariables ref3 = new ConceptVariables();
        System.out.println(ref3.d-ref3.c);
    }

    public static void main(String[] args) {
        ConceptVariables ref2 = new ConceptVariables();
        ref2.add();
//        System.out.println(ConceptVariables.a);
        sub();
    }
}
