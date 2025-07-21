
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