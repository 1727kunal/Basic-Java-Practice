package conceptofcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        s1.add("Mango");
        s1.add("Banana");
        s1.add("Apple");
        s1.add("Watermelon");
        s1.add("Apple");
        System.out.println("Original Set Data : " +s1);

        s1.remove("Apple");
        System.out.println("After removing apple : "+s1);

        System.out.println("Is watermelon present in data? " +s1.contains("Watermelon"));

        Set<String> s2 = new HashSet<String>();
        s2.add("Jackfruit");
        s2.addAll(s1);
        System.out.println("Original data in Set 2 "+s2);

        System.out.println("Printed data in Set 2 by using Iterator...");
        Iterator<String> itr = s2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Converting set to array...");
        String [] fruits = s2.toArray(new String[s2.size()]);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("Converting array to set...");
        int [] rollNumbers = new int[]{240,241,242,243,243,243,244,244,245,240};
        Set<Integer> s3 = new HashSet<Integer>();
        for(int i=0; i<rollNumbers.length;i++){
            s3.add(rollNumbers[i]);
        }
        System.out.println(s3);
    }
}
