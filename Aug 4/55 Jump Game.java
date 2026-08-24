// class Solution {
//     public boolean jumpGame(int[] nums, int index){
//         if (index >= nums.length-1) { return true; }
//         for (int i=1; i<=nums[index]; i++){
//             if (jumpGame(nums, index+i)) { return true; }
//         }
//         return false;
//     }
//     public boolean canJump(int[] nums) {
//         int index = 0;
//         return jumpGame(nums, index);
//     }
// }
class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > farthest)
                return false;

            farthest = Math.max(farthest, i + nums[i]);

            if (farthest >= nums.length - 1)
                return true;
        }

        return true;
    }
}