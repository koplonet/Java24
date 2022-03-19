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
public class Point3D extends Point {
    public int z;
    
    public Point3D (int x, int y, int z) {
        super (x,y);
        this.z = z;
    }
    
    public void move (int x, int y, int z) {
        this.z = z;
        super.move(x, y);
    }
    
    public void translate (int x, int y, int z) {
        this.z += z;
        super.translate (x, y);
    }
}
