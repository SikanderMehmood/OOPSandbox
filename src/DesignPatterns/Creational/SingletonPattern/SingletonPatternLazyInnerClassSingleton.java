package DesignPatterns.Creational.SingletonPattern;

public class SingletonPatternLazyInnerClassSingleton {

    private   SingletonPatternLazyInnerClassSingleton(){

    }
    private static class SingletonHelper{
        private static final SingletonPatternLazyInnerClassSingleton obj = new SingletonPatternLazyInnerClassSingleton();
    }

    public static  SingletonPatternLazyInnerClassSingleton getInstance(){
        return SingletonHelper.obj;
    }
}
