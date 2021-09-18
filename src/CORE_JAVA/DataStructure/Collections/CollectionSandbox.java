package CORE_JAVA.DataStructure.Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public interface CollectionSandbox {

     boolean add(Object object);
     boolean addAll(Collections arraylist); //to add complete collection
     void clear(); //remove all elements from the invoking collection
     boolean contains(Object object);
     boolean containsAll(Collection c);//return true if all element are present
     boolean equals(Object object);//return true if invoking collection and object are equal
     int hashCode();//return the hashcode of the invoking collection
     boolean isEmpty(); //return true if the invoking collection is empty
     Iterator iterator(); //return iterator for the invoking collection
     boolean remove(Object object);
     boolean removeAll(Collection collection); //remove all elements from the invoking collection
     boolean retainAll(Collection collection); //remove all elements from the invoking collection except the elements in the list
     int size();//return size on invoking collection.
     Object[] toArray();//Returns object array on the invoking collection
     Object[] toArray(Collection collection);//return an array of the collection passed as argument
}
