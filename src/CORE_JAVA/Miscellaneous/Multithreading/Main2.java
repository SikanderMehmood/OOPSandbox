package CORE_JAVA.Miscellaneous.Multithreading;

public class Main2 {


    public static class InnerClass implements Runnable{

        @Override
        public void run(){
            System.out.println("in the runnable method");
        }

    }




    public static void main(String args[]){

        InnerClass innerClass = new InnerClass();
        innerClass.run();

        Thread thread = new Thread(new InnerClass());
        thread.start();

    }


}
