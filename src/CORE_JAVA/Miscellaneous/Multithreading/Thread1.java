package CORE_JAVA.Miscellaneous.Multithreading;

public class Thread1 extends Thread {

    MathUtils mathUtils;

    public Thread1(MathUtils mathUtils) {
        this.mathUtils = mathUtils;
    }

    @Override
    public void run() {
        try {
            mathUtils.printMultiples(5);
        } catch (Exception ex) {

        }
    }
}
