import java.lang.System;
import java.util.Scanner;

class number{
    public static void main(String args[])
    {
        Scanner vinoj = new Scanner(System.in);
        int a = vinoj.nextInt(); vinoj.nextLine();
        int b = vinoj.nextInt(); vinoj.nextLine();
        int c = vinoj.nextInt(); vinoj.nextLine();
        int d = a*b*c;
        int e = a+b+c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(d/e);
    }
    
}