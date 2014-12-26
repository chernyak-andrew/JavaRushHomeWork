package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < 32; i++)
        {
            alphabet.add((char) ('а' + i));
        }
        alphabet.add(6, 'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        ArrayList<Character> letters = new ArrayList<Character>();
        for (int i = 0; i < list.size(); i++)
        {

            for (int j = 0; j < list.get(i).length(); j++)
            {
                letters.add(list.get(i).charAt(j));
            }
        }

        Map<Character, Integer> resultMap = new LinkedHashMap <Character, Integer>();
        for (int i = 0; i < alphabet.size(); i++){
            resultMap.put(alphabet.get(i), 0);
        }

        for (int i = 0; i < letters.size(); i++)
        {
            Character letter = letters.get(i);

            if (alphabet.contains(letter))
            {
                if (resultMap.containsKey(letter))
                {
                    int count = resultMap.get(letter) +1;
                    resultMap.put(letter, count);
                } else
                {
                    resultMap.put(letter, 1);
                }
            } else
            {
                throw new Exception("There symbol not from russian alphabet : " + letter);
            }
        }

        for (Map.Entry<Character, Integer> pair : resultMap.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }

}
