package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 08, Lesson 11, Bonus 03
 * <p/>
 * Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
 * <p/>
 * Date: 08.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String[] array = new String[20];

        for ( int i = 0; i < array.length; i++ )
        {
            array[i] = reader.readLine();
        }

        sort( array );

        for ( String x : array )
        {
            System.out.println( x );
        }
    }

    public static void sort( String[] array )
    {
        for ( int i = 0; i < array.length - 1; i++ )
        {
            for ( int j = 0; j < array.length - i - 1; j++ )
            {
                if ( isGreaterThen( array[j], array[j + 1] ) )
                {
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen( String a, String b )
    {
        return a.compareTo( b ) > 0;
    }
}