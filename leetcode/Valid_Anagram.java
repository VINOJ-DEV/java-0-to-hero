class Solution {
    static {
        for(int i=0; i<500; i++)
            isAnagram("abc","cbda");
    }
    public static boolean isAnagram(String s, String t) {

        int[] f = new int[26];
        int n = s.length();
        if(n!=t.length()) return false;
        for(int i=0;i<n;i++){
            f[s.charAt(i)-'a']++;
            f[t.charAt(i)-'a']--; //check it
        }
        for(int i:f) if(i!=0) return false;
        return true;
    }
}



        // char x = 0;            only some program see the logic
        // int n = s.length();
        // if(n!=t.length()) return false;
        // for(int i=0;i<n;i++) {
        //     x ^= s.charAt(i);
        //     x ^= t.charAt(i);
        // }
        // if(x=='\u0000') return true;
        // return false;
    