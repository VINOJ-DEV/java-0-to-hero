// Get numbers a,b and print numbers from a to b
import java.lang.System;
import java. util.Scanner;

class solution{
    public static void main(String args[])
    {
        Scanner vinoj = new Scanner (System.in);
        int a = vinoj.nextInt();vinoj.nextLine();
        int b = vinoj.nextInt();

        for (int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}