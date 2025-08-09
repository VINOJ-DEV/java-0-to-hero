class Solution {
    public boolean repeatedSubstringPattern(String s) {
    
    String doubled =  s+s;
    String substr = doubled.substring(1,doubled.length()-1);
    return substr.contains(s);
       
    }
}       




        // try 1 - not a fit
        // char x = 0;
        // for(char y : s.toCharArray())
        // x ^= y;

        // if(x == '\u0000') return true;
        // else return false;

        // try 2 - not a fit
        // if(s.length()==1) return false;
        // int[] x = new int[26];
        // int max = 0;
        // for(char i : s.toCharArray())  x[i-'a']++;
        
        // for(int i : x) if(i>max) max=i;

        // for(int i : x) if(i<max && i!=0) return false;
        
        // return true;