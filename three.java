import java.lang.System;
import java.util.Scanner;

class Hello{
    public static void main(String args[]){
    Scanner vinoj = new Scanner (System.in);
    int a = vinoj.nextInt();
    String b = vinoj.nextLine();
    String c = vinoj.next();

    System.out.print(a+b+c);
    System.out.print(c);
    }

}