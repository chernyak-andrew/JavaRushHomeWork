package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> childrens = new ArrayList<Human>();
        childrens.add(new Human("son1", true, 20, null));
        childrens.add(new Human("son2", true, 17, null));
        childrens.add(new Human("doter", false, 18,null));

        ArrayList<Human> father = new ArrayList<Human>();
        father.add(new Human("father", true, 50, childrens));

        ArrayList<Human> mother = new ArrayList<Human>();
        mother.add(new Human("mother", false, 45, childrens));

        ArrayList<Human> grandparents = new ArrayList<Human>();
        grandparents.add(new Human("ded1", true, 88, father));
        grandparents.add(new Human("ded2", true, 85, mother));
        grandparents.add(new Human("baba1", true, 78, father));
        grandparents.add(new Human("baba2", true, 76, mother));


        System.out.println(childrens);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandparents);

    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (children == null)
                this.children = new ArrayList<Human>();
            else
                this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
