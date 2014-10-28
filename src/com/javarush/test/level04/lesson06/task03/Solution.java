package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int max;
        int mid;

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());

        max = firstNumber;

        if (secondNumber > max){
            max = secondNumber;
            mid = firstNumber;
        } else
        mid = secondNumber;

        if (thirdNumber > max){
            System.out.println(thirdNumber);
            System.out.println(max);
            System.out.println(mid);
        }
        else{
            System.out.println(max);
            sort(thirdNumber, mid);
        }

    }

    private static void sort(int a, int b)
    {
        if (a > b)
        {
            System.out.println(a);
            System.out.println(b);
        } else
        {
            System.out.println(b);
            System.out.println(a);
        }
    }
}
