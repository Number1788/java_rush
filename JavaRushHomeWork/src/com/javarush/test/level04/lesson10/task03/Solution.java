package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a;
        String b;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        b=reader.readLine();
        a=Integer.parseInt(reader.readLine());
        while (a>0){
            System.out.println(b);
            a--;
        }


    }
}