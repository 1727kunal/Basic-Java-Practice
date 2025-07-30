package conceptofcollection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(30);
        s1.push(20);
        s1.push(10);
        s1.push(1000);
        s1.push(2000);
        System.out.println("Data in stack : " +s1);

        System.out.println("First element in stack is : " +s1.peek());

        s1.pop();
        System.out.println("Data in stack after pop : "+s1);

        System.out.println("Printed stack data using Iterator...");
        Iterator<Integer> it1 = s1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("Printed stack data using Enumeration...");
        Enumeration<Integer> en = s1.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
