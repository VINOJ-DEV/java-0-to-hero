class Solution {
    public int countOdds(int low, int high) {
        return ((high + 1) / 2) - (low / 2);
        // +1 helps include the last odd number when high itself is odd
        // low+1 Not need, because we want odds before low
    }
}/// idea: in a range half is odd, half is even so count total with high(inclusive) - subract with lowest(exclusive)
 /// to get specific range 