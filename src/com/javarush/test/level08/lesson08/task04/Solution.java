package com.javarush.test.level08.lesson08.task04;


import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Пушкик", new Date("MARCH 1 1987"));
        map.put("Пупкин", new Date("AUGUST 1 1985"));
        map.put("Печкин", new Date("MARCH 1 1987"));
        map.put("Матроскин", new Date("NOVEMBER 1 1979"));
        map.put("Шарик", new Date("APRIL 1 1925"));
        map.put("Пит", new Date("JUNE 1 1978"));
        map.put("Шварц", new Date("APRIL 1 1975"));
        map.put("Швайгер", new Date("NOVEMBER 1 1979"));
        map.put("Кейдж", new Date("AUGUST 1 1978"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if ((month >= 5) && (month <= 7))
                iterator.remove();
        }
    }

}
