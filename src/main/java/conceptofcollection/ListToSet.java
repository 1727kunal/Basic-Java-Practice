package conceptofcollection;
import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        //List to Set
        List<String> l1 = new ArrayList<>();
        l1.add("Mango");
        l1.add("Banana");
        l1.add("Watermelon");
        l1.add("Apple");
        l1.add("Mango");
        l1.add("Kiwi");

        System.out.println("Data in the list -----> "+l1);
        Set<String> s1 = new HashSet<>(l1);
        System.out.println("Data in the Hash Set -----> ");
        Iterator<String> itr1 = s1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println("Data in the Linked Hash Set -----> ");
        Set<String> s2 = new LinkedHashSet<>(l1);
        Iterator<String> itr2 = s2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        System.out.println("Data in the Tree Set -----> ");
        Set<String> s3 = new TreeSet<>(l1);
        Iterator<String> itr3 = s3.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
    }
}
