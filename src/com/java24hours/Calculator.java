package com.java24hours;

public class Calculator {
    public static void main(String[] arguments) {
        float sum = 0;
        for (String argument : arguments) {
            sum = sum + Float.parseFloat(argument);         
        }
        System.out.println("Сумма этих чисел равна " + sum);
    }
}