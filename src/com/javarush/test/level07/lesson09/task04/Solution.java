package com.javarush.test.level07.lesson09.task04;

import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза");
        list.add("иа");
        list.add("оза");
        list.add("та");
        list.add("ляля");

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        ArrayList<String> tempList = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            if (s.contains("р") && s.contains("л"))
                tempList.add(s);
            else if (s.contains("л")) {
                tempList.add(s);
                tempList.add(s);
            } else if (s.contains("р"))
                     continue;
            else
            tempList.add(s);

        }
        return tempList;
    }

}