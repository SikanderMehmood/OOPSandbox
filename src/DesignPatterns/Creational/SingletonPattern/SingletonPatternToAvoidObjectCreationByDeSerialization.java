package DesignPatterns.Creational.SingletonPattern;

import java.io.Serializable;

public class SingletonPatternToAvoidObjectCreationByDeSerialization implements Serializable {

    private static SingletonPatternToAvoidObjectCreationByDeSerialization obj;

    private SingletonPatternToAvoidObjectCreationByDeSerialization(){}

    public static SingletonPatternToAvoidObjectCreationByDeSerialization getInstance(){
        if(obj==null){

            synchronized (SingletonPatternToAvoidObjectCreationByDeSerialization.class){
                if(obj==null){
                    obj=new SingletonPatternToAvoidObjectCreationByDeSerialization();
                }
            }

        }
        return obj;
    }

    protected Object readResolve(){
        return getInstance();
    }
}
