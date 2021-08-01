package Models;

public class  Dog {

    private String dodName;
    private int age;


    public void bark(int a) { System.out.println("Dog bark in parent method"); }

    public static int methodOne(){
        return 1;
    }


    public static int  methodOne(int one, int two){
        return 1;
    }

    public void bark(double a) { System.out.println("Dog bark in parent method with double"); }

    public String mathasd() {
        return "asfa";
    }

    public static void staticMethod() {
        System.out.println("Printing the static method in abstract class");
    }

    // public abstract void abstractvoidmethod();


    public static class DogNestedClass {

       public DogNestedClass (){

       }

    }


}


  class SomeNewDog extends Dog {

    public SomeNewDog(){}


}
