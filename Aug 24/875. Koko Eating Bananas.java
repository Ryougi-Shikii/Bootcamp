class Solution {
    public long helper(int[] piles, int k) {
        long res = 0;
        for (int i : piles) {
            res += (i + k - 1) / k;;
        }
        return res;
    }

    public int rec(int[] piles, int low, int high, int h) {
        if (low > high) {
            return low;
        }

        int mid = low + (high - low) / 2;
        long totalHours = helper(piles, mid);

        if (totalHours <= h) {
            return rec(piles, low, mid - 1, h);
        } else {
            return rec(piles, mid + 1, high, h);
        }
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            if (pile > high) {
                high = pile;
            }
        }

        return rec(piles, low, high, h);
    }
}