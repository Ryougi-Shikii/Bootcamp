class Solution {
    public int dp(int n, int[] memo){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 2;
        }
        if(memo[n] != -1){
            return memo[n];
        }
        memo[n] = dp(n-1, memo) + dp(n-2, memo);
        return memo[n];
    }
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        for(int i=0; i<memo.length; i++){
            memo[i] = -1;
        }
        return dp(n-1, memo);
    }
}