package abstraction;

public class MyChild1 extends MyAbstract{
    @Override
    void testMethod1() {
        System.out.println("Method 1 implementation provided in child class...");
    }

    public static void main(String[] args) {
        MyChild1 obj1 = new MyChild1();
        obj1.testMethod1();
        obj1.testMethod2();
        MyChild1.testMethod3();
    }
}
