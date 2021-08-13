package CORE_JAVA.Miscellaneous.Multithreading;

public class main3 {

    public static void main(String args[]){

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("in this method");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();


    }

}
