package com.trainingmug.java;

public class TypeCasting {
    public static void main(String[] args) {
        byte age;
        age = 35;
        int ageValue;
        ageValue = (int)age;

        float value;
        value = 234234.2f;

        int intValue;
        intValue = (int)value;
        System.out.println(intValue);

        ageValue = 130;
        age = (byte)ageValue;
        System.out.println("Age : " + age);

        byte test;
        System.out.println(test);
    }
}
