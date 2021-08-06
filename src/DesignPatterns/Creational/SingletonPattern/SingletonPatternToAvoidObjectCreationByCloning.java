package DesignPatterns.Creational.SingletonPattern;

/*
Due to business requirement i want to extend Clone class in the Singleton class, but by doing so i can another instance of the SingleTon class.
So to avoid this
 */



public class SingletonPatternToAvoidObjectCreationByCloning extends Clone{

    private static SingletonPatternToAvoidObjectCreationByCloning obj;

    private SingletonPatternToAvoidObjectCreationByCloning(){}

    @Override
    protected Object clone() throws CloneNotSupportedException {
          throw new CloneNotSupportedException();
    }

    public static SingletonPatternToAvoidObjectCreationByCloning getInstance(){
        if(obj==null){
            synchronized (SingletonPatternToAvoidObjectCreationByCloning.class){
                if(obj==null){
                    obj=new SingletonPatternToAvoidObjectCreationByCloning();
                }
            }
        }

        return obj;
    }

}
