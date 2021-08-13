package CORE_JAVA.DataStructure.Collections.Map;

/*
HashMap is not synchronized.
HashMap can store null elements
only one null key is possible in HashMap
HashMap extends AbstractMap class and implements Map interface;
HashMap maintains no order
Initial default capacity of HashMap is 16 with the load factor of 0.75

 */


import java.util.*;

public class SandBoxHashMap {

    HashMap map = new HashMap();

    public void doSomeThing(){

        map.put(1,"SomeValue1") ;
        map.put(2,"SomeValue2") ;
        map.put(3,"SomeValue3") ;
        map.put(4,"SomeValue4") ;
        map.put(5,"SomeValue5") ;
        map.put(6,"SomeValue6") ;
        map.put(7,"SomeValue7") ;

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println("Key"+iterator.next()    +  "Value" + map.get((int)iterator.next()));
        }

        System.out.println(map.values().stream().sorted());

    }


    //Using treeMap constructor to sort the HashMap
    //A TreeMap is always sorted based on keys.
    public void someNewFunction(){
        TreeMap<Integer,String> treemap = new TreeMap(map);

    }


}