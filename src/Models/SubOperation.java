package Models;

public class SubOperation implements Operation{
    @Override
    public int performOperation(int a, int b) {
        return a-b;
    }
}
