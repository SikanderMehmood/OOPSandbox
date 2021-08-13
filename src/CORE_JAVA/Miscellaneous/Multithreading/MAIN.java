package CORE_JAVA.Miscellaneous.Multithreading;

public class MAIN {

    public static class MyClass extends Thread{

        @Override
        public void  run(){
            System.out.println("Inside run method");
        }
    }



    public static void main(String[] args) {

        MyClass myclass = new MyClass();
        myclass.start();
        Thread1 thread1 = new Thread1(new MathUtils());
        thread1.start();

        Thread2 thread2 = new Thread2(new MathUtils());
        thread2.run();

        Thread thread = new Thread(new Thread2(new MathUtils()));
        thread.start();

    }


}
