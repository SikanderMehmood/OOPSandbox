package Implementations;

import Models.Dog;

public  class BullDog extends Dog {

    static final int anInt;

    static {

        anInt = 1;
    }

    Dog dog = new Dog();

    private BullDog() {

    }

    private BullDog(int i) {
    }


    public void bark() {
        System.out.println("This Dog barks");
    }

    public static int methodOne(int one, int two){
        return 1;
    }
}
