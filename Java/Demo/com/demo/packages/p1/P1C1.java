package com.demo.packages.p1;

public class P1C1
{
    // Private

    private String privateVar = "private var";

    private void privateMethod()
    {
        System.out.println("Private Method!");
    }

    // Package Private

    String packagePrivateVar = "package private var";

    void packagePrivateMethod()
    {
        System.out.println("PackagePrivateMethod");
    }

    // Protected

    protected String ProtectedVar = "protected var";

    protected void ProtectedMethod()
    {
        System.out.println("ProtectedMethod");
    }

    // Public

    public String publicVar = "public var";

    public void  publicMethod()
    {
        System.out.println("Public Method");
    }


    public static void main(String args[])
    {
        P1C1 p1C1 = new P1C1();
        System.out.println(p1C1.privateVar);
        p1C1.privateMethod();
        System.out.println(p1C1.packagePrivateVar);
        p1C1.packagePrivateMethod();
        System.out.println(p1C1.ProtectedVar);
        p1C1.ProtectedMethod();
        System.out.println(p1C1.publicVar);
        p1C1.publicMethod();
    }
}