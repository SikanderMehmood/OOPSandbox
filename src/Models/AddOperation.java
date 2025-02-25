package Models;

public class AddOperation implements Operation{
    @Override
    public int performOperation(int a, int b) {
        return a+b;
    }

    public void print(){
        System.out.println("Print this shit in add operation");
    }
}
