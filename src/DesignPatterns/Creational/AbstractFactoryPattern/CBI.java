package DesignPatterns.Creational.AbstractFactoryPattern;

public class CBI implements Bank{
    private final String BNAME;
    public CBI(){
        BNAME="SBI BANK";
    }
    public String getBankName(){
        return BNAME;
    }
}
