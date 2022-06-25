package com.masai;
import java.util.*;
public class Result {
    public static void main( String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N");
        int n=sc.nextInt();
        /* rectacgale */
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        *****
//        *   *
//        *   *
//        *   *
//        *****
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(i==0 || i==n-1 || j==0 || j==n-1)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //*
        //**
        //***
        //****
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //*****
        //****
        //***
        //**
        //*

//        for(int i=0;i<n;i++)
//        {
//            for(int j=n;j>i;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //   *
        //  **
        // ***
        //****
//        for(int i=0;i<n;i++)
//        {
//            for(int j=1;j<n-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        1
//        12
//        123
//        1234
//        12345
//

//        12345
//        1234
//        123
//        12
//        1
//
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=n;j>=i;j--)
//            {
//                System.out.print(n-j+1);
//            }
//            System.out.println();
//        }

//
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//
//        int count=1;
//for(int i=0;i<=n;i++)
//{
//    for(int j=0;j<i;j++)
//    {
//        System.out.print(count+" ");
//        count++;
//    }
//    System.out.println();
//}



//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
//
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(0+" ");
                }
                else
                {
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }

    }
}
