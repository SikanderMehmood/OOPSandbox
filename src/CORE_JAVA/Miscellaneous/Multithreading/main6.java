package CORE_JAVA.Miscellaneous.Multithreading;

public class main6 {

    public static void main(String args[]) throws InterruptedException {

        Runnable runnable = ()->{
            for(int i=0;i<5;i++){
              sleep();
                System.out.println("Running");
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        thread.join();
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
