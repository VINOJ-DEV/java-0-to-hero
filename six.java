import java.lang.System;
import java.util.Scanner;

class number{
    public static void main(String args[])
    {
        Scanner vinoj = new Scanner (System.in);
        String name = vinoj.nextLine();
        double mark = vinoj.nextDouble(); vinoj.nextLine();
        String add  = vinoj.nextLine();
        
        System.out.println("Name : "+name);
        System.out.println("Mark : "+mark/10);
        System.out.println("Address : "+add);
    }
}