package com.demo.exceptions;

public class handledException {
    public handledException(){
        result = 0;
    }

    // Java have a default constructor which will initialise all the instance variables
    int result; // Instance Variable
    private void test()
    {
//        int result = 0;
        try {
            int i = 100;

            System.out.println("divide by zero");
            result = i / 0;

        } catch (Exception ex) {
            System.out.println("Exception Occurred: " + ex);
        }

        System.out.println("abruptly terminated, so this does not execute");
        System.out.println(result);

    }
    public static void main(String[] args) {
       // int result = 0;
        handledException obj = new handledException();
        obj.test();
    }

}
