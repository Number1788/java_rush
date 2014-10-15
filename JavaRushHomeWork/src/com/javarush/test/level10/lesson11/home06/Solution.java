package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
       String firstname,lastname,soname;
       boolean sex, married;
       int age;
        public Human(String firstname, String lastname, String soname){

        }
        public Human(String firstname,boolean sex){

        }
        public Human (String firstname, boolean married,boolean sex){

        }
        public Human(String firstname, int age){

        }
        public Human(String firstname, String lastname, String soname, boolean sex,boolean married,int age){

        }
        public Human(String firstname, String lastname, String soname, boolean sex){

        }
        public Human(String firstname, String lastname){

        }
        public Human(String firstname, String lastname, boolean sex){

        }
        public Human(String firstname, String lastname, int age){

        }
        public Human(String firstname, String lastname, int age,boolean sex){

        }
    }
}
