package conceptofcollection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        List<String> myLinkList1 = new LinkedList<String>();
        myLinkList1.add("Watermelon");
        myLinkList1.add("Banana");
        myLinkList1.add("Grapes");

        List<String> myLinkList2 =new LinkedList<String>();
        myLinkList2.add("Orange");

        myLinkList2.addAll(myLinkList1);
        System.out.println("After merging 2 Linked List : "+myLinkList2);

        myLinkList2.add("Banana");
        System.out.println(myLinkList2);

        myLinkList2.remove(myLinkList2.get(4));
        System.out.println(myLinkList2);

        System.out.println("Is banana present in list? " + myLinkList2.contains("Banana"));

        ListIterator<String> listItr1 = myLinkList2.listIterator();
        while (listItr1.hasNext()){
            System.out.println(listItr1.next() + " is present at index " + listItr1.nextIndex());
        }

        int [] numbers = new int[]{10,10,20,30,90,80,50,60,60};
        List<Integer> myLinkList3 = new LinkedList<Integer>();
        for(int i=0; i<numbers.length; i++){
            myLinkList3.add(numbers[i]);
        }
        System.out.println("Linked list of numbers : "+myLinkList3 );
    }
}
