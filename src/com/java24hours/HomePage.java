/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import java.net.*;

/**
 *
 * @author Admin
 */
public class HomePage {
        String owner;
        URL address;
        String category = "нет";
        
        public HomePage(String inOwner, String inAddress)
                throws MalformedURLException {
            
            owner = inOwner;
            address = new URL(inAddress);
        }
        
        public HomePage(String inOwner, String inAddress,
                        String inCategory)
                throws MalformedURLException {
            
            this(inOwner, inAddress);
            category = inCategory;
        }
    }
