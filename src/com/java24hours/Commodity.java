package com.java24hours;

class Commodity {
    public static void main(String[] arguments) {
        String command = "ПОКУПКА";
        int balance = 550;
        int quantity = 42;
        
        switch (command) {
            case "ПОКУПКА":
                quantity += 5;
                balance -= 20;
                break;
            case "ПРОДАЖА":
                quantity -= 5;
                balance += 15;
        }
        System.out.println("Баланс: $" + balance + "\n" +
                            "Количество: " + quantity);
    }
}