package Collections;

/*
 ArrayList used dynamic array for storing elements
 ArrayList can have duplicate elements
 ArrayList maintains insertion order
 Arraylist class in non-synchronized -> not thread safe -> two threads can access its methods at the same time
 ArrayList allows random access of objects because array works on index bases.
 In ArrayList manipulation is bit slower than LinkList because a lot of shifting occurs when removing a element from the list
 List must have same type of elements

 ArrayList implements "Collection","List", "Serializable", "Iterable","Cloneable" and extends "AbstractList class";

 We cannot store primitive type in arrayList, when we do arraylist.add(22) , jvm converts 22 to Integer object and stores it in the list.

 Array and ArrayList both can store NULL values;

 ArrayList is better when you need to search for something  than LinkList.
 LinkList is better when you need to perform add/remove operations and manipulations on data


 */


import java.util.*;

public class SandBoxArrayList {


    public int someThing() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Something");
        list.add("Something");
        list.add("Something");
        list.add("Something");
        list.add("Something");
        list.add("Something");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("asdasd");
        list2.add("asdasdad");
        list2.add("asdasdasd");
        list2.add("asdasdasd");
        list2.add("asdasdasd");
        //printing all with forEach loop
        for (String oneItem : list) {
            System.out.println(oneItem);
        }

        //-------------
        list.add("Something");
        list.add("Something");

        //Looping/iterating over list elements
        Iterator ot = list.iterator();
        while (ot.hasNext()) {
            System.out.println(ot.next());
        }

        //Sorting ArrayList in ascending/Descending order
        Collections.sort(list); //ascending order
        Collections.sort(list,Collections.reverseOrder());//descending order

        //Compare two lists
        boolean is =   list.equals(list2);
        boolean removeAll = list.removeAll(list2);
        list.contains(list2);


        //reverse a arrayLIST
        Collections.reverse(list);


        //Make a list unModifiable
        Collections.unmodifiableCollection(list);
        list.add("Asdas"); //This will give UnsupportedOperationException at runtime;



      //There is no property 'length ' on ArrayList; to know how many elements you use size() method;
        list.size();

        //We can use
        Collections.synchronizedCollection(list);
        //to synchronized an arraylist to make it thread safe so only one thread can acces the class method at a time;






        return 1;

    }


}
