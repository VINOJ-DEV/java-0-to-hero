// StringBuilder is a class in Java that provides a mutable sequence of characters, allowing for efficient string manipulation. Unlike the String class, which is immutable, StringBuilder allows modifications to the string without creating new objects, making it more efficient for frequent string operations
// such as append, insert, replace, delete, and reverse.

class Solution {
    public String mergeAlternately(String word1, String word2) {
       String x =word1; String y =word2;
       
        while (x.length() < y.length()){ x+=" ";}
        while (y.length() < x.length()){ y+=" ";}

        StringBuilder a = new StringBuilder();

        for (int i=0;i<x.length();i++){
            a.append(x.charAt(i));
            a.append(y.charAt(i));
        }
        String b = a.toString();
        return(b.replace(" ",""));
    }}