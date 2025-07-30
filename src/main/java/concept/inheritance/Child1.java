package concept.inheritance;

public class Child1 extends Parent{

  /*  Child1(String n){
        super();
        System.out.println("Child 1 constructor executed...");
    }
*/
    Child1(){
        super("Kunal");
        System.out.println("Child 1 constructor executed...");
    }
    public static void main(String[] args) {
        //Child1 ref = new Child1("abc");

        Child1 ref2 = new Child1();
    }
}
