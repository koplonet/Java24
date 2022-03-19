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
public class Gremlin {
    static int gremlinCount =0;
    
    public Gremlin() {
        gremlinCount++;
    }
    
    static int getGremlinCount() {
        return gremlinCount;
    }
}
