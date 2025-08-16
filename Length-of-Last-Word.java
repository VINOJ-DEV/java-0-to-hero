class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int c = 0;
        if(n==1) return 1;
        for(int i=(n-1);i>-1;i--){
            if(c==0 && s.charAt(i) == ' ') continue;
            if(s.charAt(i)!=' ') c++;
            else if(s.charAt(i)==' ') return c;
        }
        
    return c;}
}