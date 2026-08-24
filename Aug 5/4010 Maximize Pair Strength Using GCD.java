import java.util.Arrays;
class Solution {
    public int gcd( int a, int b ){
        while(b!=0){
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }
    public int lcm( int a, int b ){
        return Math.abs(a*b) / gcd(a, b);
    }
    public long maxPairStrength(int[] nums) {
        // Arrays.sort(nums);
        long maximum = 1;
        for ( int i = 0; i < nums.length; i++){
            for ( int j = i+1; j < nums.length; j++){
                long g = gcd(nums[i], nums[j]);
                long value = 1L*nums[i]*nums[j];
                maximum = Math.max(maximum, value/(1L*g*g));
            }
        }
        return maximum;
    }
}