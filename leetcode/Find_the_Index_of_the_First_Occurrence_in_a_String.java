class Solution {
    public int strStr(String haystack, String needle) {
       /// easy method return    haystack.indexOf(needle)
        StringBuilder x = new StringBuilder();
        int n = needle.length();
        int h = haystack.length();

        for(int i=0;i<h;i++){
            if(i+n>h) break;
            x.setLength(0);
            x.append(haystack.substring(i,i+n));
            if((x.toString()).equals(needle)) return i;
            
        }
        return -1;
        
    }
}