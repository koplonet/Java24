/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import java.awt.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class FontMapper {
    public FontMapper(){
        Font times = new Font("Times New Roman", Font.BOLD, 12);
        Font verdata = new Font("Verdana", Font.ITALIC, 25);
        Font courier = new Font("Courier New", Font.PLAIN, 6);
        HashMap<String, Font> fonts = new HashMap<>();
        fonts.put("Основной текст", times);
        fonts.put("Заголовок", verdata);
        fonts.put("Мелкий шрифт", courier);
        for (Map.Entry<String, Font> entry : fonts.entrySet()) {
            String key = entry.getKey();
            Font value = entry.getValue();
            System.out.println(key + ": " + value.getSize() + 
                               "-pt " + value.getFontName());
        }
    }
    
    public static void main(String[] arguments) {
        new FontMapper();
    }
}