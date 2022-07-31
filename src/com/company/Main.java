package com.company;

import java.util.Scanner;

public class Main {
    private static Number res;
    private static Double resultOfDivision;
    private static Double firstNum;
    private static Double secondNum;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Let's enter your first number:");
        try {
            firstNum = input.nextDouble();
        } catch (Exception exception){
            System.out.println("Data that was entered is not a number");
            System.exit(0);
        }

        System.out.println("Select an operator for further calculation: +, -, *, or /\"" + " We are working just with mentioned list of operators");
        char operator = input.next().charAt(0);

        System.out.println("Let's enter your second integer number:");
        try {
            secondNum = input.nextDouble();
        }catch (Exception exception){
            System.out.println("Data that was entered is not a number");
            System.exit(0);
        }


        if (((firstNum == Math.floor(firstNum)) && !Double.isInfinite(firstNum)) &&
                ((secondNum == Math.floor(secondNum)) && !Double.isInfinite(secondNum))) {
            CalculatorInteger calculator = new CalculatorInteger();
            process(operator, calculator);
        } else {
            CalculatorDouble calculatorDouble = new CalculatorDouble();
            process(operator, calculatorDouble);
        }


    }

    public static void returnResult(Number result) {
        System.out.println("Your result is " + result);
    }

    public static void resultDivision(Double result) {
        System.out.println("Your result is " + result);
    }

    public static void process(char operator, FunctionsCalculator calculator) {
        switch (operator) {
            case '+':
                res = calculator.addition(firstNum, secondNum);
                returnResult(res);
                break;
            case '-':
                res = calculator.subtraction(firstNum, secondNum);
                returnResult(res);
                break;
            case '/':
                resultOfDivision = calculator.division(firstNum, secondNum);
                resultDivision(resultOfDivision);
                break;
            case '*':
                res = calculator.multiplication(firstNum, secondNum);
                returnResult(res);
                break;
            default:
                System.out.println("Sorry but we don`t have answer for you as not operator was used\nUse any of mentioned operators instead of "+operator);
        }

    }
}
