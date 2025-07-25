public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // prevent overflow
            int result = guess(mid);

            if (result == 0) {
                return mid; // found the number
            } else if (result < 0) {
                right = mid - 1; // guess is too high
            } else {
                left = mid + 1; // guess is too low
            }
        }

        return -1; // not found (should never happen if pick is in [1, n])
    }
}
