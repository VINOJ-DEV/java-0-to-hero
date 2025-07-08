import java.lang.System;
import java.util.Scanner;

class start{
    public static void main(String arg[]){
        Scanner vinoj = new Scanner(System.in);
        String Name = vinoj.nextLine();
        int Age = vinoj.nextInt(); vinoj.nextLine();
        String Address = vinoj.nextLine();

        System.out.println(Name);        // println to print in nextline
        System.out.println(Age);
        System.out.print(Address);
    }
}