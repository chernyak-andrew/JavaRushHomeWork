package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
       HashSet<String> set = new HashSet<String>();

        set.add("Ляп");
        set.add("Лип");
        set.add("Лям");
        set.add("Лум");
        set.add("Лук");
        set.add("Лял");
        set.add("Липа");
        set.add("Лупа");
        set.add("Ляпок");
        set.add("Ляпон");
        set.add("Ляпиш");
        set.add("Лапусик");
        set.add("Ляпанас");
        set.add("Ляпундр");
        set.add("Ляпухич");
        set.add("Ляпсин");
        set.add("Ляпщок");
        set.add("Ляпрун");
        set.add("Ляпси");
        set.add("Ляпсыц");

        return set;
    }
}
