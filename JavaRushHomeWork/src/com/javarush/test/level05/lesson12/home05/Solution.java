package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
import
        java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
       int sum=0,a;
       String string;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       while (true){
           string=reader.readLine();
           if (string.equals("сумма")) break;
           a=Integer.parseInt(string);
           sum+=a;
       }
       System.out.println(sum);

    }
}
