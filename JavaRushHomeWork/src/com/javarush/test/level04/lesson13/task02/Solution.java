package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int m,n,i;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        m=Integer.parseInt(reader.readLine());
        n=Integer.parseInt(reader.readLine());
        i=n;
        for (; m>0;m--){
            for (n=i; n>0;n--)
                System.out.print(8);
            System.out.println();
        }

    }
}
