package com.mortgagecalculator;

public class MortgageCalculator {
    public static Mortgage getMortgage(double price, double downPayment,
                                       LoanType loanType, float interestRate,
                                       float propertyTaxRate) {  /*I'm including property tax rate as an
                                                                    argument instead of zip until we can
                                                                    figure out how to implement a ZIP
                                                                    code/property tax API*/
        Mortgage mortgage = new Mortgage(price, downPayment, loanType, interestRate, propertyTaxRate);
        calculateMonthlyPayment(mortgage);
        calculateMonthlyPrincipleInterest(mortgage);
        calculateMonthlyMortgageInsurance(mortgage);
        calculateMonthlyPropertyTax(mortgage);
        calculateMonthlyHomeOwnersInsurance(mortgage);

        return mortgage;
    }

    // OVERLOADED GETMORTGAGE TO ALLOW PASSING A DOWN PAYMENT PERCENT AS WELL AS THE RAW DOLLAR FIGURE (ABOVE)
    public static Mortgage getMortgage(double price, float downPaymentPercent,
                                       LoanType loanType, float interestRate,
                                       float propertyTaxRate) {  /*I'm including property tax rate as an
                                                                    argument instead of zip until we can
                                                                    figure out how to implement a ZIP
                                                                    code/property tax API*/
        Mortgage mortgage = new Mortgage(price, downPaymentPercent * price, loanType, interestRate, propertyTaxRate);
        calculateMonthlyPayment(mortgage);
        calculateMonthlyPrincipleInterest(mortgage);
        calculateMonthlyMortgageInsurance(mortgage);
        calculateMonthlyPropertyTax(mortgage);
        calculateMonthlyHomeOwnersInsurance(mortgage);

        return mortgage;
    }

    // example calculation method
    private static double calculateMonthlyPayment(Mortgage mortgage) {
        double monthlyPayment = 0;
        // calculate monthly payment
        mortgage.setMonthlyPayment(monthlyPayment);
        return monthlyPayment;
    }

    // ONLY IMPLEMENT THIS METHOD ONCE WE'VE FIGURED OUT IF WE CAN DO A ZIP CODE -> PROPERTY TAX RATE CALCULATION
    // IF WE AREN'T GOING TO ADD THAT, WE CAN DELETE THIS METHOD
    private static double calculateMonthlyPropertyTaxRate(Mortgage mortgage) {
        return 0.0;
    }

    private static double calculateMonthlyPrincipleInterest(Mortgage mortgage) {
        return 0.0;
    }

    private static double calculateMonthlyMortgageInsurance(Mortgage mortgage) {
        return 0.0;
    }

    private static double calculateMonthlyPropertyTax(Mortgage mortgage) {
        return 0.0;
    }

    private static double calculateMonthlyHomeOwnersInsurance(Mortgage mortgage) {
        return 0.0;
    }
}