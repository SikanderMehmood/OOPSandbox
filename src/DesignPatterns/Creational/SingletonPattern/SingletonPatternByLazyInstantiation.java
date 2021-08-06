package DesignPatterns.Creational.SingletonPattern;




public class SingletonPatternByLazyInstantiation {
    private static SingletonPatternByLazyInstantiation obj;

    private SingletonPatternByLazyInstantiation(){

    }

    public static SingletonPatternByLazyInstantiation getInstance(){
        if(obj==null) {
            synchronized (SingletonPatternByLazyInstantiation.class) {
                if (obj == null) {
                    obj = new SingletonPatternByLazyInstantiation();
                }
            }
        }
        return obj;

    }


}
