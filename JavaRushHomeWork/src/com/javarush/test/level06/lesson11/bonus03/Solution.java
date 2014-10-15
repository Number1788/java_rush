package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int i;
        String s;
        for (i = 0; i < arr.length; i++) {
            s=reader.readLine();
            arr[i] =Integer.parseInt(s);

        }
        Arrays.sort(arr);
        for (i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
