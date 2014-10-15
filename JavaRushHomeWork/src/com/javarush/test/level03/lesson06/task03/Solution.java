package com.javarush.test.level03.lesson06.task03;

/* Семь цветов радуги
Выведи на экран текст: семь цветов радуги.
В каждой строке должно быть по три цвета, в последней - один.
Цвета разделяй пробелом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i=0,j=0;
        String color1="красный", color2="оранжевый",color3="желтый",space=" ",
                color4="зеленый",color5="голубой",color6="синий",color7="фиолетовый";

            switch (i){
                case 0:
                    System.out.println(color1+space+color2+space+color3);
                case 1:
                    System.out.println(color4+space+color5+space+color6);
                case 2:
                    System.out.println(color7);
            }



    }
}