import Implementations.BullDog;
import Implementations.ChildClass;
import Implementations.HippoAnimal;
import Implementations.PoodleDog;
import Models.Animal;
import Models.Book;
import Models.Dog;
import Models.SampleEnum;
import SandBox.*;
import com.sun.codemodel.internal.JForEach;


import javax.xml.namespace.QName;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    static List<Integer> globalList = new ArrayList<>();
    static int x=0;
    static int bias=0;

    public static void main(String[] args) {

        List<Integer> ratings = new ArrayList<>();
        ratings.add(4);
        ratings.add(2);
        ratings.add(5);
        ratings.add(1);
        globalList.addAll(ratings);

        int size = ratings.size();
        for (Integer var : ratings) {
            ratings.remove(var);
            System.out.println(ratings);


        }

    }}
