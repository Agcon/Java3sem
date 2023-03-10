package ru.agcon.new_labs.laba6.zadanie11;

public class Main {

    public static void main(String[] args) {
        double dbCurrentTemp = -40.0;
        System.out.println("Current temperature: " + dbCurrentTemp);
        System.out.println("Current temperature in Kelvin: " + new KelvinConverter().getConvertedValue(dbCurrentTemp));
        System.out.printf("Current temperature in Fahrenheit: %.2f" , new FahrenheitConverter().getConvertedValue(dbCurrentTemp));
    }
}
