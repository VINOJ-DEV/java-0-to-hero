// NOTE  1.  Single quotation for char ' '
//       2.  f or F at last for float number 
//       3.  String  has            variable.charAT(index)
//       4.  Default value of BOOLEAN is  false

import java.lang.System;
class hello{
      public static void main(String args[])
      {
        float a = 1.123456f;
        char b = 'v';
        String var = "vinoj";

        System.out.println(a);
        System.out.println(b);
        System.out.println(var);
        System.out.println(var.charAt(0));

        Boolean c = true;   /// or false also
        System.out.println(c);

      }
}