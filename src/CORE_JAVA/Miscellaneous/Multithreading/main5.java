package CORE_JAVA.Miscellaneous.Multithreading;

public class main5 {

    public static class MyClass implements Runnable {

        public boolean requestStop = false;

        public synchronized void stop() {
            this.requestStop = true;
        }

        public synchronized boolean isRequestStop() {
            return this.requestStop;
        }

        private void sleep() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }


        @Override
        public void run() {
            System.out.println("in the runnable method");

            try {
                while (!isRequestStop()) {
                    sleep();
                    System.out.println("...");
                }

            } catch (Exception ex) {

            }

        }


    }


    public static void main(String args[]) throws InterruptedException {
        MyClass myClass  = new MyClass();
        Thread thread = new Thread(new MyClass(),"custom thream");
        thread.setDaemon(true);
        thread.start();



        Thread.sleep(5000);
        System.out.println("stopping");
        myClass.stop();
        System.out.println("stopped");




    }


}
