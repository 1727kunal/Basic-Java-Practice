package conceptofcollection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<String>();
        v1.add("Banana");
        v1.add("Grapes");

        Vector<String> v2 = new Vector<String>();
        v2.add("Watermelon");

        v2.addAll(v1);
        System.out.println("Data in vector 2 : " +v2);
        v2.add(0,"Apple");
        v2.add("Apple");
        System.out.println("Data in vector 2 : " +v2);

        v2.remove("Apple");
        System.out.println("Data in vector 2 : " +v2);

        System.out.println("Is vector contains Grapes : "+v2.contains("Grapes"));
        System.out.println("Fruit at index 2 is " +v2.get(2));

        System.out.println("Vector data printed using Iterator...");
        Iterator<String> it1 = v2.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        System.out.println("Vector data printed using Enumerator...");
        Enumeration<String> en = v2.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
