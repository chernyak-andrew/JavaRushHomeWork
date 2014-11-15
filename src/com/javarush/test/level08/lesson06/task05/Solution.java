package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution {
    public static List getListForGet() {
        List list = new ArrayList();
        for (int x = 0; x < list.size(); x++)
            list.get(x);

        return list;
    }

    public static List getListForSet() {
        List list = new ArrayList();
        for (int x = 0; x < list.size(); x++)
            list.set(x, x);

        return list;
    }

    public static List getListForAddOrInsert() {
        List list = new LinkedList();
        for (int x = 0; x < list.size(); x++)
            list.add(x);

        return list;
    }

    public static List getListForRemove() {
        List list = new LinkedList();
        for (int x = 0; x < list.size(); x++)
            list.remove(0);

        return list;
    }
}
