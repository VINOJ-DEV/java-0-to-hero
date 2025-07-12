// ternary operator
// Replaces the need of  if-else

import java.lang.System;
import java.util.Scanner;

class ternary{
    public static void main(String args[])
    {
        Scanner vinoj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = vinoj.nextInt();

        System.out.println(num >10 ? "Greater than 10" : "Lesser than 10");
    }
}
