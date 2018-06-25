package com.brainacad.oop.testgenerics3;

import java.util.Arrays;
import java.util.Random;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    //методику перемешивания нашел в интернете
    public T[] shuffle(){
        Random rnd = new Random();
        //делаем копию массива, чтобы не изменять массив-источник
        T[] newArr = Arrays.copyOf(array,array.length);
        for (int i = newArr.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            T a = newArr[index];
            newArr[index] = newArr[i];
            newArr[i] = a;
        }
        return newArr;
    }
}
