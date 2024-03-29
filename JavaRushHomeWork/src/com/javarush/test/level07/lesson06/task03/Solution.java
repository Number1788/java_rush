package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i;
        String tmp;
        for (i=0;i<5;i++)
            list.add(reader.readLine());
        tmp=list.get(0);
        list.set(0,list.get(4));
        list.set(4,tmp);
        tmp=list.get(1);
        list.set(1,list.get(3));
        list.set(3,tmp);
        for (i=0;i<list.size();i++) System.out.println(list.get(i));

    }
}
