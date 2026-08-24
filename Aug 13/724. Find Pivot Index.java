class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++){
            sum = sum+nums[i];
            left[i] = sum;
        }
        sum = 0;
        for (int j=n-1; j>=0; j--){
            sum = sum+nums[j];
            right[j] = sum;
        }
        for (int i=0; i<n; i++){
            if (left[i]==right[i]){
                return i;
            }
        }
        // for (int x: left){
        //     System.out.print(x + " ");
        // }
        // System.out.println();
        // for (int x: right){
        //     System.out.print(x + " ");
        // }
        return -1;
    }
}