package CORE_JAVA.DataStructure.Collections.Set;


/*

TreeSet class contain unique elements like Hashset;
TreeSet retrieval and access time is very fast;
TreeSet doesn't allow null elements
TreeSet class is non-synchronized;
TreeSet class maintain ascending order

TreeSet implements navigable interface
Navigable interface extends SortedSet, Set, Collection and Iterable interface.

Elements in the TreeSet must be of Comparable type, if they are custom they must implement Comparable interface.

 */


import Models.Book;

import java.util.HashMap;
import java.util.Set;

public class TreeSet {

    public static Book generateBookObjects(){
        return new Book("book1", (int) Math.random());
    }


    public static void main(String[] args)
    {
        Set<String> ts1 = (Set<String>) new TreeSet();

        // Elements are added using add() method
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");

        // Duplicates will not get insert
        ts1.add("C");

        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);
    }

}
