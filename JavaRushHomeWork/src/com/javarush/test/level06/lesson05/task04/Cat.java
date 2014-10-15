package com.javarush.test.level06.lesson05.task04;

/* Cчётчик котов
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
*/

public class Cat
{
    static int catCount;

    public Cat()
    {
        ++catCount;
    }

    @Override
    protected void finalize()
    {
        --catCount;
    }
}
