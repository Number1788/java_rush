package com.javarush.test.level05.lesson12.home03;



public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Dog dog= new Dog("Dog", 43,20);
        Cat catTom= new Cat("Tom",22,13);
        //Напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int weight;
        int tooth;

        public Dog(String name, int weight, int tooth)
        {
            this.name = name;
            this.weight = weight;
            this.tooth = tooth;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //Напишите тут ваши классы

}
