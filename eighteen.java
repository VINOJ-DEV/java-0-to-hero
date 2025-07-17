// get size of an array from user
// get numbers(input) from user
// print middle element as output

import java.lang.System;
import java.util.Scanner;

class sol{
    public static void main(String args[])
    {
        System.out.print("Enter size of an array : ");
        Scanner vinoj = new Scanner (System.in);
        int n = vinoj.nextInt();
        int[] a = new int [n];

        System.out.print("Enter the numbers : ");
        for(int i=0;i<n;i++)
        {
            a[i]=vinoj.nextInt();
        }
        
        System.out.print("The middle no is : "+a[n/2]);


    }
}