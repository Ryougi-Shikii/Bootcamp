# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.res = -1
        self.i = 0
        def inorder(root, k):
            if not root or self.res != -1:
                return
            inorder(root.left, k)
            self.i += 1
            if self.i == k:
                self.res = root.val
                return
            inorder(root.right, k)
        inorder(root, k)
        return self.res