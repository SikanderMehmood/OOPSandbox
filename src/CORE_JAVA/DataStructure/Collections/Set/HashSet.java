package CORE_JAVA.DataStructure.Collections.Set;


/*


HashSet stores elements by a mechanism called hashing;
HashSet only contain unique elements
HashSet allow null value
Hashset class is non-synchronized means not-thread safe , means two threads can access its methods at the same time;
Hashset does not maintain insertion order , here elements are inserted on the basis of their hashcode.
HashSet is the best approach for  search operations
Initial default capacity of hashset is 16, but the load factor is 0.75

-----
A list can contain duplicate elements where set can only have unique elements
-----

Hashset class extend AbstractSet  and implements Set Interface , Cloneable and serializable interface
HashSet uses "HashMap" internally in java!





 */



import java.util.Iterator;
import java.util.Set;

public class HashSet extends AbstractSet implements Set {

  static   Set<String> set = new java.util.HashSet<>();

    static{
        set.add("asdasd");
        set.add("fsdfsdf");

        Iterator y = set.iterator();
        while (y.hasNext()){
            System.out.println(y.next());
        }



    }

   // set.removeAll(set1);
  //  set.removeIf(str->str.contains("Vijay")); remove on base of condition
    //


}
