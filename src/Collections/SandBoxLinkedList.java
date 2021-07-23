package Collections;


/*

Java LinkList use doubly linkList(means we can add and remove elements from both sides of the list) to store elements
it implements "List" and  "Deque","Cloneable" ,"Serializable", interface and extends AbstractSequentialList CLASS;

LinkList can contain duplicate elements;
LinkList class maintains insertion order;
LinkList class is non-synchronized means not thread safe -> two threads can access its methods at the same time
In LinkList manipulations is fast because no shifting needs to occur;




 */

import sun.jvm.hotspot.oops.Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

}