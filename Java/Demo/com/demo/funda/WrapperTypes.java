package com.demo.funda;

public class WrapperTypes {

    // Examples to demonstrate methods of float wrapper

    public static void main(String[] args) {

        float floatPrimitive = 10.5f;
        Float floatObj = Float.valueOf(floatPrimitive);
        System.out.println("Float Value: " + floatObj);

        // Some common methods usd in real-time applications
        // isNaN() method checks if the value is NaN (Not a Number)
        // Example of isNaN() method. The below produces NAN because of 0.0/0.0 which is undefined

        float nanValue = 0.0f/0.0f;
        Float nanObj = Float.valueOf(nanValue);

        System.out.println("isNaN: " + floatObj.isNaN());
        System.out.println("isNan (NaN): " + nanObj.isNaN());

        // Other Methods

        System.out.println("is Infinite: " + floatObj.isInfinite());
        System.out.println("toString: " + floatObj + " Float" );
        System.out.println("hashcode: " + floatObj.hashCode());
        System.out.println("compareTo with (10.5f): " + floatObj.compareTo(10.5f));
        System.out.println("compareTo with (20.5f): " + floatObj.compareTo(20.5f));
        System.out.println("compareTo with (5.5f): " + floatObj.compareTo(5.5f));
        System.out.println("Equals (with 10.5f): " + floatObj.equals(10.5f));

        // find the difference between two float values

        Float anotherFloatObj = Float.valueOf(20.5f);
        System.out.println("Difference between two float values: " + (anotherFloatObj - floatObj));








    }
}
