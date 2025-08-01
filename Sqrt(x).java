class Solution {
    public int mySqrt(int x) {
    
        for (int i = 1; ; i++) {
            long square = (long) i * i;
            if (square == x)
                return i;
            if (square > x)
                return i - 1;
        }
    }
}   