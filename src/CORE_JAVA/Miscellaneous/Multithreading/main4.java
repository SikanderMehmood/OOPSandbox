package CORE_JAVA.Miscellaneous.Multithreading;

public class main4 {

    public static void main(String args[]){

        Runnable runnable = () ->{
            System.out.println("in lambda function");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            }catch (InterruptedException ex){
                System.out.println(ex);
            }

            System.out.println("Finished execution");
        };

        Thread thread  = new Thread(runnable,"sikander");
        System.out.println(Thread.currentThread().getName());
        thread.start();

    }

}
