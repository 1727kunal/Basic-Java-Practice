package conceptofcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo1 {

    public static void main(String[] args) {
        //Collection c1 = new ArrayList();
        List l1 = new ArrayList();
        l1.add("Kunal");
        l1.add(34);
        l1.add(true);
        l1.add("Kunal");
        l1.add(null);
        l1.add(34);
        l1.add(null);
        System.out.println("List data = " +l1);

        System.out.println("Element at index 1 = "+l1.get(1));

        l1.remove(null);
        System.out.println("List data = " +l1);

        l1.remove(1);
        System.out.println("List data = " +l1);


    }
}
