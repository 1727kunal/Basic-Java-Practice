package concept.inheritance;

public class MethodOverridingChild1 extends MethodOverridingParent {

    public static void main(String[] args) {
        MethodOverridingChild1 ref = new MethodOverridingChild1();
        ref.loginBy();
    }

    @Override
    void loginBy() {
        super.loginBy();
        System.out.println("Login using Google or Facebook...{CHILD1}");
    }
}
