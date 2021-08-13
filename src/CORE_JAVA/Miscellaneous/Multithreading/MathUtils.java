package CORE_JAVA.Miscellaneous.Multithreading;

public class MathUtils {

    public void printMultiples(int x) {
        try {
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(x * i);
                }
                Thread.sleep(400);
            }
        } catch (Exception ex) {

        }
    }

}
