package com.javarush.test.level02.lesson08.task04;

/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Использовать функцию из задачи 1.
*/
public class Solution
{
    public static void main(String[] args){
        int a= 3, b =5, c=8, d=12;
        int m = min (a,b,c,d);
        System.out.println(m);
    }
    public static int min(int a, int b, int c, int d)
    {
        int m;
        int m1= min(a,b);
        int m2= min(c,d);
        m= min(m1,m2);
        return m;

    }

    public static int min(int a, int b)
    {
        int minimum;
        if (a < b)
            minimum = a;
        else minimum = b;
        return minimum;
    }
}