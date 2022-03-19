package com.java24hours;

public class DslModem extends Modem {
    String method = "DSL-подключение";
    
    public void connect() {
        System.out.println("Подключение к Интернету...");
        System.out.println("Используем " + method);
    }
}