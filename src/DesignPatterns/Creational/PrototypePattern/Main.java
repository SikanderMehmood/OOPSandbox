package DesignPatterns.Creational.PrototypePattern;

public class Main {

    public static void main(String args[]){
        EmployeeRecord e1=new EmployeeRecord(12,"asdasd","sasdasd",12,"eaddress");
        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
