import Implementations.BullDog;
import Implementations.ChildClass;
import Implementations.HippoAnimal;
import Implementations.PoodleDog;
import Models.Animal;
import Models.Book;
import Models.Dog;
import Models.SampleEnum;
import SandBox.*;


import javax.xml.namespace.QName;
import java.util.*;
import java.util.stream.Collectors;


class MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


public class Main {

    public static Book generateBookObjects(){
        return new Book("book1", (int) Math.random());
    }

    public static void main(String[] args) {

        Set<Book> newset = new TreeSet<>(new MyComparator());

        newset.add(new Book("book2", 10));
        newset.add(new Book("book3", 7));
        newset.add(generateBookObjects());
        newset.add(generateBookObjects());

        for(Book one :newset){
            System.out.println(one.getName() + " " +  one.getPages());
        }





}
}
