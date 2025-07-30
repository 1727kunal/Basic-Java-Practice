package abstraction;

public abstract class MyAbstract {

    abstract void testMethod1();

    void testMethod2()
    {
        System.out.println("Non-abstract OR Concrete Method...");
    }

    static void testMethod3(){
        System.out.println("Non-abstract OR Concrete Method (Static in nature)...");
    }
}
