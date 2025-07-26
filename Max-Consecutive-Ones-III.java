class Solution {
    public int longestOnes(int[] nums, int k) {
        // No window len is given so, we need dynamic window based on condition
        // step1 : basic var needed
        int max=0;
        int flip=0;  // counts to check k
        int left = 0;

        for(int i=0;i<nums.length;i++)
        {       
                if(nums[i]==0) flip++;
                
                while(flip>k){  
                    if(nums[left]==0){flip--;}
                    left++;                   // in all cases
                }
                max = Math.max(max,i-left+1);
        }
        // assume i is right
        return max;
            

        }
        
    }
