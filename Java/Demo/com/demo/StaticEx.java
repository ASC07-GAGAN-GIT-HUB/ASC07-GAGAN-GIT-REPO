package com.demo;

class Employee {
    static String companyName;
    String employeeName;
}
public class StaticEx {
    public static void main(String[] args)
    {
        Employee.companyName = "Ascendion";
        System.out.println(Employee.companyName);

        Employee employee1 = new Employee();

        employee1.employeeName = "John";
        Employee employee2 = new Employee();

        employee2.employeeName = "Rambo";

        System.out.println(Employee.companyName);
        System.out.println(employee1.companyName);
        System.out.println(employee2.companyName);
        System.out.println(employee1.employeeName);
        System.out.println(employee2.employeeName);

        employee1.companyName = "Ascendion Engg";

        System.out.println(Employee.companyName);
        System.out.println(employee1.companyName);
        System.out.println(employee2.companyName);


    }
}
