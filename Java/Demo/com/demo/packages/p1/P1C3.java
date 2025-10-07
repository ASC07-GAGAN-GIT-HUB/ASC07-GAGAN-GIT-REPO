package com.demo.packages.p1;

public class P1C3 extends P1C1
{
    public static void main(String args[])
    {
        P1C3 p1C3 = new P1C3();
        p1C3.testAccess();
    }

    public void testAccess()
    {
            P1C1 p1C1 = new P1C1();
//            System.out.println(p1C1.privateVar);
//            p1C1.privateMethod();

            System.out.println(p1C1.packagePrivateVar);     // By Object of Base class
            p1C1.packagePrivateMethod();
            System.out.println(p1C1.ProtectedVar);
            p1C1.ProtectedMethod();

            System.out.println(ProtectedVar);  // By Inheritance
            ProtectedMethod();

            System.out.println(p1C1.publicVar);
            p1C1.publicMethod();
    }
}
