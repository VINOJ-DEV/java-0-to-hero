// 0 basic variables
// 1st window in max  and increase count , then only u can remove left side elements representation
// 2nd  next windows , move one by one till last , so i<length of s
// for integer type -->  count = count - isvow(s.charAt(i-k)) + isvow(s.charAt(i));


class Solution {
    public int maxVowels(String s, int k) {
         
        int max = 0;
        int count = 0;

        for (int i=0;i<k;i++) {if(isvow(s.charAt(i))) {count+=1;}}
        max=count; // it is must for the logic 
        
        for (int i=k;i<s.length();i++) {
        
           if (isvow(s.charAt(i-k))) count-=1;
           if (isvow(s.charAt(i))) count+=1;

            if (count > max) {max = count;}
        }
        return max;
    }
    private boolean isvow (char c) { return "aeiuo".indexOf(c) != -1; }
}