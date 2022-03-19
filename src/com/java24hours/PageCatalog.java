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
public class PageCatalog {
    public static void main(String[] arguments) {
        HomePage[] catalog = new HomePage[5];
        try {
            catalog[0] = new HomePage("Майк Глайер", 
               "http://www.file770.com", "научная фантастика");
            catalog[1] = new HomePage("Шелли Пауэрс",
               "http://burningbird.net", "экология");
            catalog[2] = new HomePage("Роджерс Кейденхед",
               "http://workbench.cadenhead.org", "программирование");
            catalog[3] = new HomePage("Таеган Годдард",
               "http://politicalwire.com", "политика");
            catalog[4] = new HomePage("Мэнтон Риц",
               "http://www.manton.org");
            for (int i = 0; i < catalog.length; i++) {
                System.out.println(catalog[i].owner + ": " +
                        catalog[i].address + " -- " + 
                        catalog[i].category);
            }
            } catch (MalformedURLException e) {
                System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
