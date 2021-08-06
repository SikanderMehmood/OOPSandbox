package DesignPatterns.Creational.SingletonPattern;

/*

 */

public class SingletonPatternByEarlyInstantiation {

   private static SingletonPatternByEarlyInstantiation obj=new SingletonPatternByEarlyInstantiation();

   private SingletonPatternByEarlyInstantiation(){}

   public static SingletonPatternByEarlyInstantiation SingletonPatternFactory(){
       return obj;
   }

}
