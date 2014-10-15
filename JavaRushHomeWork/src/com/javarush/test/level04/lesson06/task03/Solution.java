package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a,b,c,i;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(reader.readLine());
        b=Integer.parseInt(reader.readLine());
        c=Integer.parseInt(reader.readLine());
        if (a<b){
           i=a;
           a=b;
           b=i;
        }
        if (b<c){
            i=b;
            b=c;
            c=i;
        }
        if (a<b){
            i=a;
            a=b;
            b=i;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
