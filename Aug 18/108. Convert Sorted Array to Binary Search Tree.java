class Solution {

    public TreeNode satbst(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = satbst(nums, left, mid - 1);
        root.right = satbst(nums, mid + 1, right);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return satbst(nums, 0, nums.length - 1);
    }
}