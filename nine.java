// HOW TO COMPARE A STRING
// IN JAVA , '==' checks for Reference(ADDRESS)  not the content
//           '.equals()'   checks actual content  e.g    var1.equals(var2)

class compare{
    public static void main(String args[])
    {
        String a = new String ("bat");
        String b = new String ("bat");

        if (a == b){System.out.println("true");}
        else{System.out.println("false");}

        if (a.equals(b)){System.out.println("true");}
        else {System.out.println("false");}
    }
}