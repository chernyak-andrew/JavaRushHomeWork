package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String firstName;
        private String secondName;
        private String nationality;
        private Date birthday;
        private boolean gender;
        private int age;
        private int height;
        private int weight;
        private int foot;
        private int size;

        public Human(String firstName){
            this.firstName = firstName;
        }
        public Human(String firstName, String secondName){
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Human(String firstName, String secondName, String nationality){
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
        }
        public Human(String firstName, String secondName, String nationality, Date birthday){
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
            this.birthday = birthday;
        }

        public Human(String firstName, String secondName, String nationality, Date birthday, boolean gender){
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
            this.birthday = birthday;
            this.gender = gender;
        }

        public Human(String firstName, String secondName, String nationality, Date birthday, boolean gender, int age){
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
            this.birthday = birthday;
            this.gender = gender;
            this.age = age;
        }

        public Human(String firstName, String secondName, String nationality, Date birthday, boolean gender, int age, int height){
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
            this.birthday = birthday;
            this.gender = gender;
            this.age = age;
            this.height = height;
        }

        public Human(String firstName, String secondName, String nationality, Date birthday, boolean gender, int age, int height, int weight){
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
            this.birthday = birthday;
            this.gender = gender;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName, String secondName, String nationality, Date birthday, boolean gender, int age, int height, int weight, int foot){
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
            this.birthday = birthday;
            this.gender = gender;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.foot = foot;
        }

        public Human(String firstName, String secondName, String nationality, Date birthday, boolean gender, int age, int height, int weight, int foot, int size){
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
            this.birthday = birthday;
            this.gender = gender;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.foot = foot;
            this.size = size;
        }





    }
}
