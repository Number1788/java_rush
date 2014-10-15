package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int[] array = new int[10];
       int[] array_2 = new int[10];
       int i; String s;

        for (i=0; i<array.length; i++)
        {
            s=reader.readLine();
            array[i]=array_2[10-i-1]=Integer.parseInt(s);
        }

        for (i=0;i<array.length;i++)
        {
            array[i]=array_2[i];
            System.out.println(array[i]);
        }

    }
}
