package DesignPatterns.Creational.AbstractFactoryPattern;

public class Main {

    public static void main(String args[]){
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b=bankFactory.getBank("ICICI");
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan("homeLoan");
        l.getInterestRate(10);
        l.calculateLoanPayment(20,2);
    }
}
