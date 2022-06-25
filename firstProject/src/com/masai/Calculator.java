package com.masai;
import java.util.*;

public class Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Operation in the form Of no" +
                "1--->Addition" +
                "2--->Subtraction" +
                "3--->Multipiction" +
                "4--->Division");
        System.out.println("Enter The value a,b and then operation");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int op = sc.nextInt();

        switch (op)
        {
            case 1:
                System.out.println("SUM of A and B is"+" "+ (a+b));
                break;
            case 2:
                System.out.println("Sub of A and B is"+" "+ (a-b));
                break;
            case 3:
                System.out.println("Mul of A and B is"+" "+(a*b));
                break;
            case 4:
                System.out.println("Div of A and B is"+" "+(a/b));
                break;

            default:
                System.out.println("Enter Valid operation");
        }
    }
}
