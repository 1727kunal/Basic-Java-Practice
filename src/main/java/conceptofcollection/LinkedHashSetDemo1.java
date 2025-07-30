package conceptofcollection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        Set<String> lhs1 = new LinkedHashSet<>();
        lhs1.add("Grapes");
        lhs1.add("Apple");
        lhs1.add("Watermelon");

        Set<String> lhs2 = new LinkedHashSet<>();
        lhs2.add("Orange");

        lhs2.addAll(lhs1);
        System.out.println(lhs2);

        lhs2.add("Orange");
        System.out.println(lhs2);

        lhs2.remove("Orange");
        System.out.println(lhs2);

        System.out.println("Printed data using Iterator...");
        Iterator<String> it = lhs2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Convert set to array");
        String [] arr = lhs2.toArray(new String[lhs2.size()]);
        for (int i = 0; i< arr.length ; i++) {
            System.out.println(arr[i] + " is present at "+ i);
        }

        System.out.println("Converting array to set");
        int [] num = new int[]{6,5,5,7,8,9,1,2,2,5,3,4,11,12,10,9};
        LinkedHashSet<Integer> numSet = new LinkedHashSet<>();
        for (int i = 0; i < num.length; i++) {
            numSet.add(num[i]);
        }
        System.out.println("Unique numbers set data : "+numSet);
    }
}
