package com.demo.packages.p2;

import com.demo.packages.p1.P1C1;
import com.demo.packages.p1.P1C3;

public class P2C3 extends P1C3{
    public static void main(String[] args)
    {
        P1C3 p1C3 = new P1C3();
        p1C3.testAccess();
    }

    public void testAccess()
    {
        P1C1 p1C1 = new P1C1();
//        System.out.println(p1C1.privateVar);  // Private will not be accessible
//        p1C1.privateMethod();

        // CANT ACCESS PACKAGE PRIVATE OUTSIDE THE ONE PACKAGE

//        System.out.println(p1C1.packagePrivateVar);
//        p1C1.packagePrivateMethod();

//      CANT ACCESS PROTECTED BY OBJECT CREATION IN OTHER PACKAGES

//        System.out.println(p1C1.ProtectedVar);
//        p1C1.ProtectedMethod();

        System.out.println(ProtectedVar);
        ProtectedMethod();

        System.out.println(p1C1.publicVar);
        p1C1.publicMethod();
    }
}
