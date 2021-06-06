package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double principal = myApp.readPrincipal();
        double rate = myApp.readRate();
        int years = myApp.readYears();
        int numCompounds = myApp.readNumCompounds();

        double investment = myApp.calculateInvestment(principal, rate, years, numCompounds);
        String output = myApp.generateOutputString(principal, rate * 100, years, numCompounds, investment);

        myApp.displayOutput(output);
    }

    private double readPrincipal() {
        System.out.print("What is the principal amount? ");
        return in.nextDouble();
    }

    private double readRate() {
        System.out.print("What is the rate? ");
        return in.nextDouble() / 100;
    }

    private int readYears() {
        System.out.print("What is the number of years? ");
        return in.nextInt();
    }

    private int readNumCompounds() {
        System.out.print("What is the number of times the interest is compound per year? ");
        return in.nextInt();
    }

    public double calculateInvestment(double principal, double rate, int years, int numCompounds) {
        return Math.ceil((principal * Math.pow(1 + rate/numCompounds,numCompounds * years)) * 100) / 100.0;
    }

    // Rate is a percentage
    public String generateOutputString(double principal, double rate, int years,
                                       int numCompounds, double investment) {
        return String.format("$%.0f invested at %.1f%% for %d years compounded %d times per year is $%.2f.",
                principal, rate, years, numCompounds, investment);
    }

    public void displayOutput(String output) { System.out.println(output); }
}
