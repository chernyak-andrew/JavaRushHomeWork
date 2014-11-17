package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Пупкин", "Рамзан");
        map.put("Шальной", "Ваха");
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> list = new ArrayList<String>(map.values());
        for (int i = 0; i < list.size() - 1; i++)
        {
            String x = list.get(i);
            for (int j = i + 1; j < list.size(); j++)
            {
                if (x.equals(list.get(j)))
                {
                    list.remove(x);
                    list.remove(x);
                    removeItemFromMapByValue(map, x);
                }
            }
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

}
