// get 5 numbers in array as input and print it
import java.lang.System;
import java.util.Scanner;

class sol{
    public static void main(String args[])
    {
        int[] a = new int[5];
        Scanner vinoj = new Scanner(System.in);

        for (int i=0;i<5;i++)
        {
            a[i]= vinoj.nextInt();vinoj.nextLine();
        }
        for (int i=0;i<5;i++)
        {System.out.println(a[i]);}
    }
}
