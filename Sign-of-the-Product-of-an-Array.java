class Solution {
    public int arraySign(int[] nums) {
        double x = 1;
        for(int i : nums) {x *= i;} System.out.print(x);
        if(x>0) return 1;
        if(x<0) return -1; 
        else return 0;
        
    }
}