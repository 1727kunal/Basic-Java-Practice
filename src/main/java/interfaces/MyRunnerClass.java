package interfaces;

public class MyRunnerClass implements ITestInterface1, ITestInterface2 {
    public static void main(String[] args) {
        MyRunnerClass ref = new MyRunnerClass();
        ref.testMethod6();
        ref.testMethod7();
        System.out.println("The PI value is = " + piValue);
        System.out.println("My name is:" + ref.testMethod8());
        System.out.println("My employee ID is:" + ref.testMethod9());
    }

    @Override
    public void testMethod6() {
        System.out.println("Implemetation has been provided for TestMethod 6");
    }

    @Override
    public void testMethod7() {
        System.out.println("Implemetation has been provided for TestMethod 7");
    }

    @Override
    public String testMethod8() {
        return "Kunal";
    }

    @Override
    public int testMethod9() {
        return 243;
    }
}
