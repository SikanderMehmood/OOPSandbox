import Implementations.BullDog;
import Implementations.ChildClass;
import Implementations.HippoAnimal;
import Implementations.PoodleDog;
import Models.Animal;
import Models.Dog;

import java.util.ArrayList;

public class Main {


    public static void main() {
        System.out.println("simple main method");
    }

    public static void main(String[] args) {


        ArrayList list=new ArrayList();
        list.add("somedata");

        System.out.println("Main method");
//        ChildClass childClass = new ChildClass();
//        childClass.printVariables();
//        childClass.staticFinalMethod();
//        childClass.staticMethod();
//        childClass.finalMehod();
//        HippoAnimal animal = new HippoAnimal();
//        Dog dog = new BullDog();
//        dog.staticMethod();
//        Dog.staticMethod();
//        main();
//        main("asda");
        a(1, 1);

        new PoodleDog().bark(1);

        PoodleDog dog = new PoodleDog();
        dog.bark(1);

        String s  = "Valie";
        s.concat("asdasd");
        System.out.println(s);

    }

    public static void a(int a, int b) {
        System.out.println("Int method");
    }

    public static void a(long a, long b) {
        System.out.println("long method");
    }


    public static void main(String args) {
        System.out.println("simple string");
    }
}
