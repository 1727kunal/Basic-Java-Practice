package conceptofcollection;

import java.util.*;

public class CollectionDemo2 {
    public static void main(String[] args) {
        List<String> l1  = new ArrayList<>();
        l1.add("Kunal");
        l1.add("Waghamare");
        l1.add("Harsha");
        l1.add("Thorat");
        l1.add("Alex");
        l1.add("Alex");
        l1.add(null);

        System.out.println("Printed list using Iterator...");
        Iterator<String> i1 = l1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }

        l1.remove(null);

        System.out.println("Printed list in forward direction using ListIterator...");
        ListIterator<String> i2 = l1.listIterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }

        System.out.println("Printed list in backward direction using ListIterator...");
        ListIterator<String> i3 = l1.listIterator(l1.size());
        while(i3.hasPrevious()){
            System.out.println(i3.previous());
        }


        ListIterator<String> i4 =l1.listIterator();
        while (i4.hasNext()){
            String currentValue = i4.next();
            if(currentValue.equals("Alex")){
                i4.remove();
            }
        }
        System.out.println("After removing Alex : " +l1);

        System.out.println("Printed list in ascending order...");
        Collections.sort(l1);
        ListIterator<String> i6 = l1.listIterator();
        while(i6.hasNext()){
            System.out.println(i6.next());
        }
    }
}
