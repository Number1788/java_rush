package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s; int i; int[] arr=new int[20];
        for (i=0;i<arr.length;i++){
            s=reader.readLine();
            arr[i]=Integer.parseInt(s);
        }
        return arr;
    }

    public static int max(int[] array) {
        int i,max;
        max=array[0];
        for (i=0;i<array.length;i++){
            if (max<array[i]) max=array[i];
        }
        return max;
    }
}
