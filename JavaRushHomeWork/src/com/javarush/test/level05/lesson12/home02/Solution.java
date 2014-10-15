package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Woman woman=new Woman("masha",13,"Moscow");
        Man man=new Man("sasha",13,"Moscow");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
    }

    public static class Man{
        int age;
        String address,name;
        public Man(String name,int age, String address){
            this.address=address;
            this.age=age;
            this.name=name;
        }
    }
    public static class Woman{
        int age;
        String address,name;
        public Woman(String name,int age, String address){
            this.address=address;
            this.age=age;
            this.name=name;
        }
    }
}
