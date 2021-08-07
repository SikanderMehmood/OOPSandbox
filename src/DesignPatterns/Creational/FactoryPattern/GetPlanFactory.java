package DesignPatterns.Creational.FactoryPattern;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if(planType==null){
            return null;
        }
        if(planType.equalsIgnoreCase("DomesticPlan")){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("Commercial")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("Institutional")){
            return new InstitutionalPlan();
        }
        return null;
    }
}
