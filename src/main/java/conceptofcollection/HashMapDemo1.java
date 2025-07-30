package conceptofcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("Mouse",10);
        m1.put("Keyboard",20);
        m1.put("CPU",30);
        m1.put("Mouse",10);
        m1.put("Mouse",50);
        System.out.println("Original data in map m1 ---> "+m1);

        Map<String,Integer> m2 = new HashMap<>();
        m2.put("RAM", 60);
        m2.put("RAM", 80);
        m2.put("Keyboard", 222);

        System.out.println("Original data in map m2 ---> "+m2);
        m2.putAll(m1);
        System.out.println("Data in both map m1 and m2 after merge ---> "+m2);

        System.out.println(m2.get("RAM"));
        System.out.println(m2.equals(m1));
        Set<Map.Entry<String, Integer>> entries = m1.entrySet();
    }
}
