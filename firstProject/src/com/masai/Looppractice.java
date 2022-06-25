package com.masai;
import java.util.*;

public class Looppractice {
    public static void main(String args[])
    {
        //print all even no till n
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even Number is"+" "+i);
            }
        }


    }
}
