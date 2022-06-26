package com.masai;
import java.util.*;

public class VOWELANDCONSONANT {

    /* Write a java application with a non-static method that will accept a character
     (a-z or A-Z) and print if that character is vowel or consonant,
     if we supply other than (a-z or A-Z) then that method should print the error message.

    Call the above method from the main method of the same class 3 times,

    first time by supplying a vowel

    the second time by supplying a consonant

    third time by supplying an invalid character  */

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          for(int i=0;i<3;i++)
          {
              System.out.println(" Enter The Character");
             String a=sc.next();
             if(a=="a")
             {
                 System.out.println("character is vowel");
             }
             else
             {
                 System.out.println("character is consonant");
             }

          }
    }
}
