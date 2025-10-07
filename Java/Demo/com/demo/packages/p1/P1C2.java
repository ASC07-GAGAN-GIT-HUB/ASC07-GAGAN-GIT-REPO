package com.demo.packages.p1;

public class P1C2
{
    public static void main(String[] args)
    {
        P1C1 p1C1 = new P1C1();

        // Private variables or methods can be accessed in the same classes only

//        System.err.println(p1C1.privateVar);
//        p1C1.privateMethod();

        // Package Private Works in the other classes of the same packages
        System.out.println(p1C1.packagePrivateVar);
        p1C1.packagePrivateMethod();

        // Protected

        System.out.println(p1C1.ProtectedVar);
        p1C1.ProtectedMethod();

        System.out.println(p1C1.publicVar);
        p1C1.publicMethod();
    }
}
