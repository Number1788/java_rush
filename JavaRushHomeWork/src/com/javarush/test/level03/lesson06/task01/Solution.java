package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String a="Мама" ,b="Мыла" ,c="Раму" ;
        print(a,b,c);
        print(a,c,b);
        print(b,a,c);
        print(b,c,a);
        print(c,a,b);
        print(c,b,a);

    }
    public static void print(String a,String b, String c){
        String m= a+b+c;
        System.out.println(m);
    }
}