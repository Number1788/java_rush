package com.javarush.test.level09.lesson06.task03;

/* Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/

public class Solution
{
    public static void main(String[] args) throws Exception,NullPointerException,ArithmeticException,ArrayStoreException
    {
        try {

            int[] m = new int[2];
            m[8] = 5;
        }
        catch (NullPointerException e){
        System.out.println("NullPointerException");
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }

        catch (ArrayStoreException e){
            System.out.println("ArrayStoreException");
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
