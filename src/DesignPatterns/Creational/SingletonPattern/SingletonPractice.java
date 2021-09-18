package DesignPatterns.Creational.SingletonPattern;

public class SingletonPractice {

    private static SingletonPractice singletonPracticeinstance;

    private SingletonPractice(){

    }

    public static SingletonPractice getInstance(){
        if(singletonPracticeinstance==null){
            synchronized (SingletonPractice.class){
                if(singletonPracticeinstance==null){
                    singletonPracticeinstance=new SingletonPractice();
                }
            }
        }
        return singletonPracticeinstance;
    }

}
