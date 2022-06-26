package com.masai;
import java.util.*;

class Student
{
    int roll;
    String name;
    int marks;
    public void displayStudentDetails()
    {
        System.out.println("Name Of Student is "+name);
        System.out.println("Roll No of Student is "+roll);
        System.out.println("Marks Of Student is "+marks);
    }
}

public class STUDENTOBJECTDETAILS {


    public static void main(String args[])
    {
        Student std1=new Student();
        std1.name="Student1";
        std1.roll=1;
        std1.marks=100;
        std1.displayStudentDetails();
        System.out.println("---------------------------------------------------");

        Student std2=new Student();
        std1.name="Student2";
        std1.roll=2;
        std1.marks=100;
        std1.displayStudentDetails();
    }
}
