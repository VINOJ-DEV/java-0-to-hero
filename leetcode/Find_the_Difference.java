class Solution {
    public char findTheDifference(String s, String t) {
        
        char x = 0;
        for(int i=0;i<s.length();i++)
            x ^= s.charAt(i);      /// ^=   a^b^c and a^b^c^d    canceled:a,b,c  contains:d
        for(int i=0;i<t.length();i++)    
            x ^= t.charAt(i);
        return x;
        
    }
}