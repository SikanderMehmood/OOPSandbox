package CORE_JAVA.Miscellaneous.Multithreading;

public class Thread2 implements Runnable {

    MathUtils mathUtils;

    public Thread2(MathUtils mathUtils) {
        this.mathUtils = mathUtils;
    }

    @Override
    public void run() {

        try {
            mathUtils.printMultiples(6);
        } catch (Exception ex) {

        }

    }
}
