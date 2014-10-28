package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat
{
    private String name ="";
    private int age = 0;
    private int weight = 0;
    private int strength = 0;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }


}
