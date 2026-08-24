class Solution {
    public int countOrders(int n) {
        long result = 1;
        long MOD = 1_000_000_007;

        for (int i = 2; i <= n; i++) {
            // (2 * i - 1) * i
            long ways = (long) (2 * i - 1) * i;
            result = (result * ways) % MOD;
        }

        return (int) result;
    }
}