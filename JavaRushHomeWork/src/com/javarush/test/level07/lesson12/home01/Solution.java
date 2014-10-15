package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int i,j=0;
        for (i=0;i<10;i++)
            list.add(Integer.parseInt(reader.readLine()));
        for (i=list.size()-1;i>=0;i--){
            list2.add(list.get(i));
        }
        for (i=0;i<list2.size();i++)
            System.out.println(list2.get(i));
    }
}
