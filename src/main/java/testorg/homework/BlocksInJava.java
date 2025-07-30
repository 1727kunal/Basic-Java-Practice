package testorg.homework;

public class BlocksInJava {

    //Static Initialization Block Executed 1st
    static
    {
        System.out.println("Static Initialization Block 1...");
    }

    static
    {
        System.out.println("Static Initialization Block 2...");
    }

    //Main method executed 2nd
    public static void main(String[] args) {
        System.out.println("Main Method...");
        new BlocksInJava();
    }

    //Instance Initialization Block Executed 3rd
    {
        System.out.println("Instance Initialization Block 1...");
    }

    {
        System.out.println("Instance Initialization Block 2...");
    }

    //Constructor Executed 4th
    BlocksInJava(){
        System.out.println("Constructor...");
    }

}
