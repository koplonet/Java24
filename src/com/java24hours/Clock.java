package com.java24hours;

import java.time.*;
import java.time.temporal.*;

class Clock {
    public static void main(String[] arguments) {
        // Определить текущее время и дату
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);
        
        //Вывести приветсвие
        if (hour < 12) {
            System.out.println("Доброе утро!\n");
        } else if (hour < 17) {
            System.out.println("Доброе день!\n");
        } else {
            System.out.println("Добрый вечер!\n");
        }
        
        //Начало формирования строки, отображающей время
        System.out.print("Сейчас ");
        
        //Сколько часов
        System.out.print(hour);
        System.out.print( (hour != 1 & hour != 21) ?
                        " часа (часов) " : " час ");
        
        //Сколько минут
        if (minute != 0) {
            System.out.print(minute);
            System.out.print( (minute != 1 & minute != 21 &
              minute != 31 & minute != 41 & minute != 51) ?
              " минуты (минут)" :" минута");
        }
        
        //Отображения числа месяца
        System.out.print("\n" + day +" ");
        
        //Название месяца
        switch (month) {
            case 1:
                System.out.print("января");
                break;
            case 2:
                System.out.print("февраля");
                break;
            case 3:
                System.out.print("марта");
                break;
            case 4:
                System.out.print("апреля");
                break;
            case 5:
                System.out.print("мая");
                break;
            case 6:
                System.out.print("июня");
                break;
            case 7:
                System.out.print("июля");
                break;
            case 8:
                System.out.print("августа");
                break;
            case 9:
                System.out.print("сентября");
                break;
            case 10:
                System.out.print("октября");
                break;
            case 11:
                System.out.print("ноября");
                break;
            case 12:
                System.out.print("декабря");
                break;    
        }
        
        //Отображение года
        System.out.print(", " + year + "\n");
        
        }    
}