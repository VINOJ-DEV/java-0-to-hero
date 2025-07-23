class Solution {
    public double findMaxAverage(int[] nums, int k) {

        // need 1.array   2.window size  3.variable for our need (i.e sum,add,subract....etc)
        double avg =0;
        //step1 : 1st window
        for(int i=0;i<k;i++){ avg+=nums[i];} 
        double max = avg;   
        
        //step2 : move the window and check ,   i.e remove left-side and add right-side elements
        //step3 : store needed in seperate variable i.e here max
        for(int i=k;i<nums.length;i++){
            avg = avg - nums[i-k] +nums[i];
            
            if(max<avg) {max=avg;}
        }


        return max/k;
    }
}