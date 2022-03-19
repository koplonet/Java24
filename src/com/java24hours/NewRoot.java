package com.java24hours;

class NewRoot {
    public static void main(String[] arguments) {
        int number = 100;
        if (arguments.length >0) {
            number = Integer.parseInt(arguments[0]);
        }
        System.out.println("Квадратный корень из "
        + number
        + " равен "
        + Math.sqrt(number)
        );
    }
}