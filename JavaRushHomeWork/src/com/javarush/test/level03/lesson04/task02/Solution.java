package com.javarush.test.level03.lesson04.task02;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i=0, j=0;
        while (i<5){
            while (j<10){
                System.out.print("Sasha ");
                j++;
            }
            System.out.println("");
            i++;
            j=0;
        }

    }
}