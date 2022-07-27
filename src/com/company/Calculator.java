package com.company;

public class Calculator {
    public Integer addition(Integer obj1, Integer obj2) {
        Integer sum = obj1 + obj2;
        return sum;
    }

    public Integer subtraction(Integer obj1, Integer obj2) {
        Integer subtraction = obj1 - obj2;
        return subtraction;
    }

    public Double division(Integer obj1, Integer obj2) {
        Double division = Double.valueOf(obj1) / Double.valueOf(obj2);
        return division;
    }

    public Integer multiplication(Integer obj1, Integer obj2) {
        Integer multiplication = obj1 * obj2;
        return multiplication;
    }

}