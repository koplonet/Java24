package com.java24hours;

class PlanetWeigh {
    public static void main(String[] arguments) {
        System.out.print("Ваш вес на Земле будет ");
        double weight = 80;
        System.out.println(weight);
        
        System.out.println("Ваш вес на Меркурии будет ");
        double mercury = weight * .378;
        System.out.println(mercury); 
        
        System.out.println("Ваш вес на Луне будет ");
        double moon = weight * .166;
        System.out.println(moon);
        
        System.out.println("Ваш вес на Юпитере будет ");
        double jupiter = weight * 2.364;
        System.out.println(jupiter);
    }
}