package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int a,b,c;
        BufferedReader readers = new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(readers.readLine());
        b=Integer.parseInt(readers.readLine());
        c=Integer.parseInt(readers.readLine());
        if (a<b && b<c) System.out.print(b);
        if (b<a && a<c) System.out.print(a);
        if (b<c && c<a) System.out.print(c);
    }
}
