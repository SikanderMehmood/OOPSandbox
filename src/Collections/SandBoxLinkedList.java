package Collections;


/*

Java LinkList use doubly linkList(means we can add and remove elements from both sides of the list) to store elements
it implements "List" and  "Deque","Cloneable" ,"Serializable", interface and extends AbstractSequentialList CLASS;

LinkList can contain duplicate elements;
LinkList class maintains insertion order;
LinkList class is non-synchronized means not thread safe -> two threads can access its methods at the same time
In LinkList manipulations is fast because no shifting needs to occur;




 */

import Models.Book;

import java.util.*;

public class SandBoxLinkedList {

    String[] array = {"asd", "asda", "asdasd"};

    List list = new LinkedList();

    public void doSomeThing(){
        list.add(array);
        list.add(1,array);


        for(String eachItem:array){
            list.add(eachItem);
        }
    }
    Book book   =new Book("one",1);
    Book book1  = new Book("Two",2);
    Book book3  = new Book("Threee",3);

    //Constructors => ways to make LinkedList

    LinkedList newlist = new LinkedList();
    LinkedList secondList = new LinkedList(Arrays.asList(book,book1,book3));


    void someFunction(){

        secondList.add(book);
        secondList.add(1,book);
        secondList.addAll(Arrays.asList(book,book3));
        secondList.addFirst(book);
        secondList.addLast(book3);
        secondList.clear();
        secondList.contains(book);
        secondList.size();
        secondList.getFirst();
        secondList.getLast();
        secondList.indexOf(book);
        secondList.toArray();


    }



}