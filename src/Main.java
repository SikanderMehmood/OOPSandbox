import Implementations.ChildClass;
import Implementations.HippoAnimal;
import Models.Animal;

public class Main {

    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();
        childClass.printVariables();
        childClass.staticFinalMethod();
        childClass.staticMethod();
        childClass.finalMehod();

        HippoAnimal animal = new HippoAnimal();
        animal.simplesimplemethods();
    }
}
