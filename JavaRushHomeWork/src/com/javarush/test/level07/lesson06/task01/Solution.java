package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String>list=new ArrayList<String>();
        int i;
        for (i=0;i<5;i++)
            list.add("i= " + i);
        System.out.println(list.size());
        for (i=0;i<5;i++)
            System.out.println(list.get(i));

    }
}
