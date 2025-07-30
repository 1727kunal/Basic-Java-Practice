package concept.inheritance;

public class MethodOverridingChild2 extends MethodOverridingChild1 {

    public static void main(String[] args) {
        MethodOverridingChild2 obj1 = new MethodOverridingChild2();
        obj1.loginBy();
    }

    @Override
    void loginBy() {
        super.loginBy();
        System.out.println("Login using Username...{CHILD2}");
    }
}
