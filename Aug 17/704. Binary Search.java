class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length-1;
        int low = 0;
        while (low<=high){
            int mid = low + (high - low) / 2;
            if (target==nums[mid]) return mid;
            if (target > nums[mid]) low = mid+1;
            if (target < nums[mid]) high = mid-1;
        }
        return -1;
    }
}