import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> Count = new HashMap<>();
        //for(int i=0;i<arr.length;i++){num=arr[i];}
        for (int num : arr)     {Count.put(num,Count.getOrDefault(num,0)+1);}

        HashSet<Integer> occur = new HashSet<>(Count.values());
        return occur.size() == Count.size();
    }
}