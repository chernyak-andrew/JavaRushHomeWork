package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfatherPerdun = new Human("Perdun", true, 77, null, null);
        Human grandfatherHrych = new Human("Hrych", true, 66, null, null);
        Human grandmotherYaga = new Human("Yaga", true,88, null, null);
        Human grandmotherIzjoga = new Human("Izjoga", true,85, null, null);
        Human father = new Human("Korch", true, 40, grandfatherPerdun, grandmotherYaga);
        Human mother = new Human("Magda", true, 52, grandfatherHrych, grandmotherIzjoga);
        Human sonVaha = new Human("Vaha", true, 15, father, mother);
        Human sonLoshara = new Human("Loshara", true, 25, father, mother);
        Human dotherDunya = new Human("Dunya", true, 13, father, mother);

        System.out.println(grandfatherPerdun);
        System.out.println(grandfatherHrych);
        System.out.println(grandmotherYaga);
        System.out.println(grandmotherIzjoga);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(sonVaha);
        System.out.println(sonLoshara);
        System.out.println(dotherDunya);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
