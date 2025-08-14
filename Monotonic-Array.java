class Solution {
    public boolean isMonotonic(int[] nums) {
        
        int n = nums.length;
        int c1=0; int c2=0;
        for(int i=0;i<=n;i++)
        {   
            if(i+2>n) break;   // +2 becoz of size is 1,2,3... but i is 0,1,2 so to compensate 0 index count
            if(nums[i]>=nums[i+1]) c1++;
            if(nums[i]<=nums[i+1]) c2++;
        }
        if(c2==n-1 || c1==n-1) return true;
        return false;
    }
}