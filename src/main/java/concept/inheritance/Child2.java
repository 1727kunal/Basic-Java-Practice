package concept.inheritance;

public class Child2 {

    Child2(){
        System.out.println("Constructor with no arguments...");
    }

    Child2(int a){
        this();
        System.out.println("Constructor with integer argument..." + a);
    }

    Child2(String s){
        this(416416);
        System.out.println("Constructor with string argument..." + s);
    }

    Child2(String x, float y){
        this("Sangli");
        System.out.println("Constructor with string and float arguments... " + "Name:" +x + " & Age:" +y);

    }

    public static void main(String[] args) {
        new Child2("Kunal",34);
    }
}
