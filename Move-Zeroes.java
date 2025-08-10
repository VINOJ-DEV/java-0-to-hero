class Solution {
    public void moveZeroes(int[] nums) {
       
       int i = 0;                                      // index for all
       for (int n : nums) if(n!=0) nums[i++]=n;        // move non zero numbers
       while (i<nums.length) nums[i++]=0;              // add zeros for remaining
    }
}