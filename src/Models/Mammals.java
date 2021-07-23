package Models;

public interface Mammals {

     default void makeNoise(){
        System.out.println("This is make noise method in Mammal interface");
    }
}
