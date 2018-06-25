package com.brainacad.oop.testgenerics3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4,5,6,7,8,9};
        String[] stringArray = {"one","two","three","four","five","six","seven","eight","nine"};
        MyMixer<Integer> intMixer = new MyMixer<>(integerArray);
        System.out.println(Arrays.toString(intMixer.shuffle()));
        MyMixer<String> strMixer = new MyMixer<>(stringArray);
        System.out.println(Arrays.toString(strMixer.shuffle()));
    }
}
