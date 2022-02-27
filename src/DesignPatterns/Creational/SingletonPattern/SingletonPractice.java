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



//class single(){


//}

//----
//6 different ways to implement singleton and wher eyou use each one!