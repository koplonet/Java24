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
public class ModemTester {
    public static void main(String[] arguments) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        surfBoard.setSpeed(500000);
        gateway.setSpeed(400000);
        System.out.println("Попытка подключения кабельного модема:");
        surfBoard.displaySpeed();
        surfBoard.connect();
        System.out.println("Попытка подключения DSL-модем:");
        gateway.displaySpeed();
        gateway.connect();
    }
}
