import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        // 0.frequency check
        int[] c1 = new int[26];
        int[] c2 = new int[26];

        for(char i : word1.toCharArray()){c1[i-'a']++;}
        for(char i : word2.toCharArray()){c2[i-'a']++;}

        // 1.length
        if(word1.length()!= word2.length()) return false;

        // 2.frequency check (operation2)
        for(int i=0;i<26;i++){
            if((c1[i]==0&&c2[i]!=0)||(c1[i]!=0&&c2[i]==0)) return false;
        }
        // 3.sort for checking all element present (operation1)
        Arrays.sort(c1);
        Arrays.sort(c2);
        return  Arrays.equals(c1,c2);   
        
    }
}
