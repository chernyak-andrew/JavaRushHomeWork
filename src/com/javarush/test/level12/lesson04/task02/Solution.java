package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(2);
        print(1);
    }

    public static int print(int i){
        return i;
    }

    public static Integer print(Integer s){
        return s;
    }
}
