package conceptofcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        myList.add("Sachin");
        myList.add("Virendra");
        myList.add("Saurav");
        myList.add("Rahul");
        myList.add("Virat");

        System.out.println("List data in forward direction...");
        ListIterator <String> itr1 = myList.listIterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next() + " is at index " + itr1.nextIndex());
        }

        System.out.println("List data in backward direction...");
        while (itr1.hasPrevious()){
            System.out.println(itr1.previous() + " is at index " + (1+itr1.previousIndex()));
        }

        //Converting ArrayList to normal array....
        System.out.println("Converting ArrayList to normal array....");
        String [] arr1 = myList.toArray(new String[myList.size()]);
        for(String s: arr1){
            System.out.println(s);
        }

        //Converting ArrayList to normal array as this method returns Object []....
        System.out.println("Converting ArrayList to normal array as this method returns Object []....");
        Object [] arr2 = myList.toArray();
        for (int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        //Converting a normal array to ArrayList....
        System.out.println("Converting a normal array to ArrayList....");
        int [] ages = new int[]{18,20,22,15,32,65,70,35,92};
        List<Integer> myList2 = new ArrayList<Integer>();
        for(int a: ages){
            myList2.add(a);
        }
        System.out.println("Data in the list 2 : "+myList2);
    }
}
