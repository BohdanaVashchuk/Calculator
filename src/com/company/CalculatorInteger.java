package com.company;

public class CalculatorInteger implements FunctionsCalculator{
    @Override
    public Number addition(Number obj1, Number obj2) {
        Number sum = obj1.intValue() + obj2.intValue();
        return sum;
    }

    @Override
    public Number subtraction(Number obj1, Number obj2) {
        Number subtraction = obj1.intValue() - obj2.intValue();
        return subtraction;
    }

    @Override
    public Double division(Number obj1, Number obj2) {
        Double division = (Double) obj1 / (Double) obj2;
        return division;
    }

    @Override
    public Number multiplication(Number obj1, Number obj2) {
        Number multiplication = obj1.intValue() * obj2.intValue();
        return multiplication;
    }
}
