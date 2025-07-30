package conceptofcollection;

import java.util.*;

public class PrintMapData {
    public static void main(String[] args) {
        HashMap<Integer,String> m1 = new HashMap<>();
        m1.put(201,"Kunal");
        m1.put(202,"Harsha");
        m1.put(203,"Omkar");
        m1.put(204,"Nilesh");
        m1.put(205,"Riyaz");

        System.out.println("-------------- Printed keys using KEYSET method --------------");
        Set<Integer> keys = new HashSet<>();
        keys= m1.keySet();
        for(Integer i: keys){
            System.out.println(i);
        }

        System.out.println("-------------- Printed values using VALUES method --------------");
        Collection<String> valuesList = new ArrayList<>();
        valuesList= m1.values();
        for(String v: valuesList){
            System.out.println(v);
        }

        System.out.println("-------------- Printed using ENTRYSET method --------------");
        Set<Map.Entry<Integer,String>> data1 = new HashSet<>();
        data1 = m1.entrySet();
        for(Map.Entry e: data1){
            System.out.println(e);
        }

        System.out.println(" -------------- Printed using Iterator method --------------");
        Set<Map.Entry<Integer,String>> data2 = new HashSet<>();
        data2 = m1.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = data2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
