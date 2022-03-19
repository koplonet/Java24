/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import java.awt.*;

/**
 *
 * @author Admin
 */
class PointTester {
    public static void main (String[] arguments) {
        Point location1 = new Point(11,22);
        Point3D location2 = new Point3D(7,6,64);
        
        System.out.println("Двумерная точка находится в (" +
                           location1.x + ", " + location1.y + ")");
        System.out.println("Она перемещается в (4, 13)");
        location1.move(4, 13);
        System.out.println("Теперь двумерная точка находится в (" +
                            location1.x + ", " + location1.y + ")");
        System.out.println("Она переместилась на -10 единицпо оси " + 
                            "x и по оси y");
        location1.translate(-10,-10);
        System.out.println("Теперь двумерная точка находится в (" + 
                            location1.x + ", " + location1.y + ")\n");
        System.out.println("Трехмерная точка находится в (" +
                            location2.x + ", " + location2.y + ", " +
                            location2.z + ")");
        System.out.println("Она перемещается в (10, 22, 71) ");
        location2.move(10, 22, 71);
        System.out.println("Теперь трехмерная точка находится в (" + 
                           location2.x + ", " + location2.y + ", " + 
                            location2.z + ")");
        location2.translate(-20, -20, -20);
        System.out.println("Теперь трехмерная точка находится в (" + 
                            location2.x + ", " + location2.y + ", " + 
                            location2.z + ")");
    } 
}
