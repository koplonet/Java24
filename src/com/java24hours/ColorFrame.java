package com.java24hours;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorFrame extends JFrame {
    JButton red, green, blue;
    
    public ColorFrame(){
        super("ColorFrame");
        setSize(322, 122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        red = new JButton("Красный");
        add(red);
        green = new JButton("Зеленны");
        add(green);
        blue = new JButton("Синий");
        add(blue);
        //Начало анонимного внутреннего класса
        ActionListener act = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == red) {
                    getContentPane().setBackground(Color.RED);
                }
                if (event.getSource() == green) {
                    getContentPane().setBackground(Color.GREEN);
                }
                if (event.getSource() == blue) {
                    getContentPane().setBackground(Color.BLUE);
                }
            }
        };
        //Конец анонимного внутренненго класса
        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        setVisible(true);
    }
    
    public static void main(String[] argument) {
        new ColorFrame();
    }
}