package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Пупкин", "Василий");
        map.put("Шальной", "Степа");
        map.put("Кролик", "Сеня");
        map.put("Шоколадный", "Петя");
        map.put("Легитимный", "Витя");
        map.put("Порох", "Петя");
        map.put("Морозов", "Павлик");
        map.put("Степной", "Жорик");
        map.put("Саакашвили", "Ваха");
        map.put("Нагаян", "Рамзан");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey().equals(familiya))
                count++;
        }
        return count;
    }
}
