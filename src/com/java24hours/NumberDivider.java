/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

/**
 *
 * @author Admin
 */
public class NumberDivider {
    public static void main(String[] arguments) {
        if (arguments.length == 2) {
            int result = 0;
            try {
                result = Integer.parseInt(arguments[0]) /
                         Integer.parseInt(arguments[1]);
                System.out.println(arguments[0] + " нацело разделить" + 
                        " на " + arguments[1] + " будет " + result);
            } catch (NumberFormatException e) {
                System.out.println("Оба аргумента должны быть"
                                        + "целочисленными" );
            } catch (ArithmeticException e) {
                System.out.println("Деление на нуль запрещено.");
            }
        }
    }
}
