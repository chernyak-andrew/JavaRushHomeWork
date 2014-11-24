package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) {

        String date = "JANUARY 30 2000";
        System.out.println(date + " = " + isDateOdd(date));
    }

    public static boolean isDateOdd(String date) {

        long msDaysFromBeginYear = new Date(date).getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int)(msDaysFromBeginYear / msDay);

        boolean result = (dayCount % 2 == 0) ? false : true;
        return result;
    }
}
