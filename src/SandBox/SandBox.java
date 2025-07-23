package SandBox;

public class SandBox {

    private  Box box;


    public void dosS(){
        Box<String> box1 = new Box();
        box1.equals("null");

        Box<Integer> box2 = new Box<Integer>();
        box2.equals(box1);
    }
}
