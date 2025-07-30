package conceptofcollection;

import java.util.*;

public class SetToList {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("Watermelon");
        s1.add("Kiwi");
        s1.add("Apple");
        s1.add("Banana");
        s1.add("Jackfruit");
        System.out.println("Original data in the Hash Set ----> " + s1);

        //This does not make sense to convert the Set to List as it is going to print the same...
        List<String> l1 = new ArrayList<>(s1);
        System.out.println("Data in the Array List ----> " + l1);

        Set<String> s2 = new TreeSet<>(s1);
        System.out.println("Data in the Tree Set ----> " + s2);
    }
}
