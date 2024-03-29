package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.parseInt(reader.readLine());

        if (maximum <= 0)
        {
            System.out.println("Error");
            return;
        }
        else
        {
            int result;
            int array[] = new int[maximum];

            for (int i =0; i < maximum; i++)
            {
                array[i] = Integer.parseInt(reader.readLine());
            }

            result = array[0];

            for (int i =1; i < maximum; i++)
            {
                result = max(array[i], result);
            }
            System.out.println(result);
        }//напишите здесь ваш код

    }

    public static int max(int a, int b)
    {
        return a > b? a: b;
    }
}
