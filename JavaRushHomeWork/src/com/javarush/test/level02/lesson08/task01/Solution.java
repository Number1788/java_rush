package com.javarush.test.level02.lesson08.task01;

/* Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.
*/
public class Solution
{
    public static void main(String[] args){
        int a= 3, b =5;
        int m = min (a,b);
        System.out.println(m);
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