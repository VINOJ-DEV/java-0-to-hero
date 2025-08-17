class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if (i+3> arr.length) break;
            int x = arr[i+1]-arr[i];
            if(arr[i+1]+x==arr[i+2]) continue;
            else return false;
        }
        return true;
    }
}