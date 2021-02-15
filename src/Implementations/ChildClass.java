package Implementations;

import Models.ParentClass;

public class ChildClass extends ParentClass {

    public ChildClass() {
        super(2, 4);
    }

    public void printVariables() {

        System.out.println(finalVariable);
        System.out.println(finalStaticVariable);
        System.out.println(staticVariable);
    }


//    public void staticMethod() {
//    }
//
//    public void staticFinalMethod() {          // you cannot do this , static or final methods cannot be overridden.
//    }
//
//    public void finalMehod() {
//    }

    @Override
    public void simpleMethod() {

    }


}
