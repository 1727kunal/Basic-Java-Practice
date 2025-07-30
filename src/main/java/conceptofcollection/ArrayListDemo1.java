package conceptofcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Carrot");
        list1.add("Apple");
        System.out.println(list1);

        List<String> list2 = new ArrayList<String>();
        list2.add("Lemon");
        list2.add("Jackfruit");
        list2.add(0,"Grapes");
        System.out.println(list2);

        list2.addAll(list1);
        System.out.println(list2);

        if(list2.contains("Apple")){
            System.out.println("Apple is present in list...");
        }

        list2.remove("Apple");
        System.out.println(list2);

        list2.remove(5);
        System.out.println(list2);

        System.out.println("Fruit at 4th index is "+list2.get(4));

        list2.add("Jackfruit");
        System.out.println(list2);

        System.out.println("Jackfruit index is: " +list2.indexOf("Jackfruit"));
        System.out.println("Last index of Jackfruit is " +list2.lastIndexOf("Jackfruit"));

        List<String> list3 = list2.subList(2,5);
        System.out.println(list3);

        System.out.println("Total number of fruits is "+list2.size());

        System.out.println("Is List2 Empty...? " +list2.isEmpty());

        list3.clear();
        System.out.println("Fruits in list 3 are "+ list3);
        System.out.println("Final data in list 2 is " +list2);
        System.out.println("List 2 data in forward direction");
        Iterator<String> itr1 = list2.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println("List 2 data in backward direction");
        ListIterator<String> itr2 = list2.listIterator(list2.size());
        while (itr2.hasPrevious()) {
            System.out.println(itr2.previous());
        }
    }
}
