package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer res;
        Double resultOfDivision;
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Great, you made your choice. Let's enter your first integer(just with them we are working) number:");
        int firstNum = input.nextInt();

        System.out.println("Select an operator for further calculation: +, -, *, or /\"" + " We are working just with mentioned list of operators");
        char operator = input.next().charAt(0);

        System.out.println("Let's enter your second integer number:");
        int secondNum = input.nextInt();

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
                System.out.println("Sorry but we don`t have answer for you");
        }
    }

    public static void returnResult(Integer result) {
        System.out.println("Your result is " + result);
    }

    public static void resultDivision(Double result) {
        System.out.println("Your result is " + result);
    }
}

