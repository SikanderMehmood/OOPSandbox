package Models;

public interface Animal {
    
     String name = "OneStaticDog"; // it is by default static and final


    default void method1(){
        System.out.println("someoutput");
    }
    //in case you include body -> you have to
    // 1) whether make default method with keyword default
    // 2) make method static

    void method2();

}
