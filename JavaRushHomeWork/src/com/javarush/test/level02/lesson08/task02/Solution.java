package com.javarush.test.level02.lesson08.task02;

/* Максимум двух чисел
Написать функцию, которая вычисляет максимум из двух чисел.
*/
public class Solution
{
    public static void main(String[] args){
        int a= 3, b =5;
        int m = max (a,b);
        System.out.println(m);
    }
    public static int max(int a, int b)
    {
        int max;
        if (a > b)
            max = a;
        else max = b;
        return max;

    }
}