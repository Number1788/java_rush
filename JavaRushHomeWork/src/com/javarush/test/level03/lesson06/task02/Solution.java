package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран надпись: таблицу умножения 10 на 10:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
       int i=1;
       while (i<=10){
           String s=print_string(i);
           i++;
           System.out.println(s);
       }

    }
    public  static String print_string(int i){
        String s="";
        int j=1, k=1;
        while (j<=10){
            k=j*i;
            j++;
            s=s+k+" ";
            k=0;
        }
        return s;
    }
}