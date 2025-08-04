class Solution {
    public int pivotIndex(int[] nums) {

        int left = 0;
        int right = 0;

        for(int i=0;i<nums.length;i++){
             for(int l=0;l<i;l++) left+=nums[l];
             for(int r=i+1;r<nums.length;r++) right+=nums[r];
            if(left==right){if(i==0) return 0;
                            else     return i; }  
            left=0;
            right=0;                              
        }
        return -1;
    }
}