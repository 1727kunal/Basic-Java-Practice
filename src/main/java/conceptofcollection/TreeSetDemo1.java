package conceptofcollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        Set<String> ts1 = new TreeSet<>();
        ts1.add("Watermelon");
        ts1.add("Apple");
        ts1.add("Kiwi");
        System.out.println(ts1);

        Set<String> ts2 = new TreeSet<>();
        ts2.add("Grapes");
        ts2.addAll(ts1);
        System.out.println(ts2);

        ts2.add("Apple");
        System.out.println(ts2);

        ts2.remove("Kiwi");
        System.out.println(ts2);

        System.out.println("Printed data using iterator...");
        Iterator<String> itr = ts2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Converting set to array...");
        String [] arr = ts2.toArray(new String [ts2.size()]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" is present at index "+i);
        }

        System.out.println("Array to set...");
        int [] num = new int[]{5,4,3,3,12,12,11,6,7,7,8,10,9,9};
        Set<Integer> ts3 = new TreeSet<>();
        for (int i = 0; i < num.length; i++) {
            ts3.add(num[i]);
        }
        System.out.println("Unique and sorted set data "+ts3);
    }
}
