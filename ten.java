
import java.lang.System;
import java.util.Scanner;

class operator{
    public static void main(String args[])
    {
        Scanner vinoj = new Scanner (System.in);

        int a = vinoj.nextInt();
        
        if (a%3 == 0 && a%5 == 0){System.out.println("it is divisible by 3 and 5");}
        else {System.out.println("it is not divisible by 3 and 5");}
        if (a>0 || !(a<0) ){System.out.println("it is positive");}
        else{System.out.println("it is negative");}
    }
}