package DesignPatterns.Creational.FactoryPattern;

import java.io.IOException;

public class main {
    public static void main(String args[]) throws IOException{
        GetPlanFactory factory = new GetPlanFactory();
        Plan plan = factory.getPlan("DomesticPlan");
        plan.getRate();
        plan.calculateBill(12);
        plan.getClass();
    }
}
