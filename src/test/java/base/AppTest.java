package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App myApp = new App();

    @Test
    public void output_string_is_formatted_properly() {
        double principal = 1500;
        double rate = 0.043;
        int years = 6;
        int numCompounds = 4;
        double investment = 1938.84;

        String expectedOutput = "$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.";
        String actualOutput = myApp.generateOutputString(principal, rate * 100, years, numCompounds, investment);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void investment_amount_is_properly_calculated() {
        double principal = 1500;
        double rate = 0.043;
        int years = 6;
        int numCompounds = 4;

        double expectedOutput = 1938.84;
        double actualOutput = myApp.calculateInvestment(principal, rate, years, numCompounds);

        assertEquals(expectedOutput, actualOutput);
    }

}