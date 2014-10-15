package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        int d=Integer.parseInt(reader.readLine());
        Solution solution = new Solution();
        int max =solution.max(a,b,c,d);
        System.out.println(max);

    }

    public int max(int a,int b, int c, int d){
        int i1=max(a,b);
        int i2=max(c,d);
        int maximum = max(i1, i2);
        return maximum;
    }
    public int max(int a, int b){
        int maximum;
        if (a>b) maximum=a;
        else maximum=b;
        return maximum;
    }
}
