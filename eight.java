
// IF-else

import java.lang.System;
import java.util.Scanner;

class ifels{
    public static void main (String args[])
    {
        Scanner vinoj = new Scanner(System.in);
        int x = vinoj.nextInt(); vinoj.nextLine();
        int y = vinoj.nextInt(); vinoj.nextLine();

        if (x>y){
            System.out.println("number 1 is greater");
        }
        else{
            System.out.println("number 2 is greater");
        }
    }
}