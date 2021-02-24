package Models;

public interface Animal {

    String name = "OneStaticDog"; // it is by default static and final


    default int method1() {
        System.out.println("someoutput");
        return 1;
    }
    //in case you include body -> you have to
    // 1) whether make default method with keyword default
    // 2) make method static

    static void simplesimplemethods() {
        System.out.println("simle static method");
    }

    void method2();

    static void staticFinalMethod() {
        System.out.println("simle static method");
    }

}
