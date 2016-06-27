package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());

        int max = getMax(firstNumber, getMax(secondNumber,thirdNumber));

        if (max!=getMax(firstNumber, secondNumber))
            System.out.println(getMax(firstNumber, secondNumber));
        else if(max!=getMax(secondNumber, thirdNumber))
            System.out.println(getMax(secondNumber, thirdNumber));
        else
            System.out.println(getMax(firstNumber, thirdNumber));

       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = a;
        if ((c < a && c > b) || (c < b && c > a) ) d = c;
        if ((b < c && b > a) || (b < a && b > c) ) d = b;
        System.out.println(d);*/

    }

    private static int getMax(int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }
}

