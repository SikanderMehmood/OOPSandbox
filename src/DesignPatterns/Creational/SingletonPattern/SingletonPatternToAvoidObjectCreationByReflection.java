package DesignPatterns.Creational.SingletonPattern;

public class SingletonPatternToAvoidObjectCreationByReflection {

    private static SingletonPatternToAvoidObjectCreationByReflection obj;

    private SingletonPatternToAvoidObjectCreationByReflection(){
        if(obj!=null){
            throw new IllegalStateException("object can't be created by reflection");
        }
    }

    public static SingletonPatternToAvoidObjectCreationByReflection getInstance(){

        if(obj==null){
            synchronized (SingletonPatternToAvoidObjectCreationByReflection.class){
                if(obj==null){
                    obj=new SingletonPatternToAvoidObjectCreationByReflection();
                }
            }
        }

        return obj;
    }
}
