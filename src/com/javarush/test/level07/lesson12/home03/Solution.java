package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();

        int first = Integer.parseInt(reader.readLine());
        int maximum = first;
        int minimum = first;
        list.add(first);

        for (int i = 0; i < 19; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
            if (x > maximum)
                maximum = x;
            else if (x < minimum)
                minimum = x;
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
