package com.demo.funda;

public class DataTypesEx
{
    public static void main(String args[])
    {
        System.out.println("Primitive Data Types in Java: ");
        System.out.println("1. byte");
        System.out.println("2. short");
        System.out.println("3. int");
        System.out.println("4. long");
        System.out.println("5. float");
        System.out.println("6. double");
        System.out.println("7. char");
        System.out.println("8. boolean");
        System.out.println("Hello");

        // assign default values

        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0f;
        double d  = 0.0d;

        // The '\u0000' is the unicode representation for the null character

        char c = '\u0000';

        boolean bool = false;

        System.out.println("\nDefault Values : ");

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // assign the max and min values to the datatypes

        System.out.println("\nMax. and Min. Values");

        System.out.println("byte Max. and Min: " + Byte.MAX_VALUE + " " +Byte.MIN_VALUE);
        System.out.println("short Max. and Min: " + Short.MAX_VALUE + " " + Short.MIN_VALUE);
        System.out.println("long Max. and Min: " + Long.MAX_VALUE + " " + Long.MIN_VALUE);
        System.out.println("int Max. and Min: " + Integer.MAX_VALUE + " " +Integer.MIN_VALUE);
        System.out.println("double Max. and Min: " + Double.MAX_VALUE + " " + Double.MIN_VALUE);
        System.out.println("float Max. and Min: " + Float.MAX_VALUE + " " + Float.MIN_VALUE);
        System.out.println("char Max. and Min: " + (int) Character.MAX_VALUE + " " + (int) Character.MIN_VALUE);
        System.out.println("boolean: " + "false and true");


        // Print the Size of memory occupied by each data type

        System.out.println("\nSize of Data Types: ");

        System.out.println("Byte size: " + Byte.BYTES + " bytes");
        System.out.println("Integer size: " + Integer.BYTES + " bytes");
        System.out.println("Short size: " + Short.BYTES + " bytes");
        System.out.println("Long size: " + Long.BYTES + " bytes");
        System.out.println("Character size: " + Character.BYTES + " bytes");
        System.out.println("Double size: " + Double.BYTES + " bytes");
        System.out.println("Float size: " + Float.BYTES + " bytes");

    }
}