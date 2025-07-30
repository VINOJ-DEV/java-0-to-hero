import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> x = new HashSet<>();
        HashSet<Integer> y = new HashSet<>();
        for (int i:nums1){x.add(i);}
        for (int i:nums2){y.add(i);}

        HashSet<Integer> x1 = new HashSet<>(x);
        HashSet<Integer> y1 = new HashSet<>(y);

        x1.removeAll(y);
        y1.removeAll(x);   /// .remove -> single element , .removeAll -> multiple element

         List<Integer> one = new ArrayList<>(x1);
         List<Integer> two = new ArrayList<>(y1);

         List<List<Integer>> tot = new ArrayList<>(); tot.add(one); tot.add(two);

         return tot;

    }
}