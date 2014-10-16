package com.company;

public class Main {

    public static void main(String[] args) {
        box<Integer> integerBox;
        integerBox = new box<Integer>();
        integerBox.add(new Integer(10));
        Integer someInteger = integerBox.get();
        System.out.println(someInteger);
    }
}
