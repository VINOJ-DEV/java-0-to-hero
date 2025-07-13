// For loop is used to repeatedly execute a Block of statements for a specific number of time

import java.lang.System;
import java.util.Scanner;

class forloop{
    public static void main(String args[])
    {
        Scanner vinoj = new Scanner (System.in);
        int a = vinoj.nextInt();

        for (int i =0;i<=5;i++){
            System.out.println(a);
        }
    }
}