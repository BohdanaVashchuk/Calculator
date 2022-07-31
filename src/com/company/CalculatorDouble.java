package com.company;

public class CalculatorDouble implements FunctionsCalculator {
    @Override
    public Number addition(Number obj1, Number obj2) {
        Number sum = (Double) obj1 + (Double) obj2;
        return sum;
    }

    @Override
    public Number subtraction(Number obj1, Number obj2) {
        Number subtraction = (Double) obj1 - (Double) obj2;
        return subtraction;
    }

    @Override
    public Double division(Number obj1, Number obj2) {
        Double division = (Double) obj1 / (Double) obj2;
        return division;
    }

    @Override
    public Number multiplication(Number obj1, Number obj2) {
        Number multiplication = (Double) obj1 * (Double) obj2;
        return multiplication;
    }
}
