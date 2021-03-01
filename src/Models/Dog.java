package Models;

public class Dog {

    private String dodName;
    private int age;


    public void bark(int a) {

        System.out.println("Dog bark in parent method");


    }

    public void bark(double a) {

        System.out.println("Dog bark in parent method with double");

    }

    public String mathasd() {
        return "asfa";
    }

    public static void staticMethod() {
        System.out.println("Printing the static method in abstract class");
    }

    // public abstract void abstractvoidmethod();


}
