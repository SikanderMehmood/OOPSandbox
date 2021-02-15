package Models;

public class ParentClass {

    public static int staticVariable;
    public static final int finalStaticVariable;
    public final int finalVariable;


    static {
        finalStaticVariable = 1;
    }


    public ParentClass(int finalVariable, int staticVariable) {
        this.finalVariable = finalVariable;
        this.staticVariable = staticVariable;
    }

    public static void staticMethod() {
        System.out.println("Parent static method");
    }

    public static final void staticFinalMethod() {
        System.out.println("Parent static final method");
    }


    public final void finalMehod() {
        System.out.println("Parent final method");
    }

    public void simpleMethod() {

    }


}
