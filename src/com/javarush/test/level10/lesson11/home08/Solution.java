package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.List;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] tempArray = new ArrayList[3];
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
        {
            list1.add("A" + i);
            list2.add("B" + i);
            list3.add("C" + i);
        }

        tempArray[0] = list1;
        tempArray[1] = list2;
        tempArray[2] = list3;

        return tempArray;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list : arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}