package com.javarush.test.level02.lesson08.task03;

/* Минимум трех чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
*/
public class Solution
{
    public static void main(String[] args){
        int a= 3, b =5,c = 8;
        int m = min (a,b,c);
        System.out.println(m);
    }
    public static int min(int a, int b, int c)
    {
       int minim;
        if (a < b){
            if (a < c)
                minim = a;
            else minim = c;
        }
        else {
            if (b < c)
                minim = b;
            else minim = c;
        }
       return minim;

    }
}