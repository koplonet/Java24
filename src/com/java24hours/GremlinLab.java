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
public class GremlinLab {
    public static void main(String[]arguments) {
        int numGremlins = Integer.parseInt(arguments[0]);
        if (numGremlins > 0) {
            Gremlin[] gremlins = new Gremlin[numGremlins];
            for (int i = 0; i < numGremlins; i++){
                gremlins[i] = new Gremlin();
            }
            System.out.println("Здесь " + Gremlin.getGremlinCount() +
                                " гремлинов.");
        }
    }
}
