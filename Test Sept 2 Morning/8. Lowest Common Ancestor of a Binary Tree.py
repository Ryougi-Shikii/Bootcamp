"""
Example:
    Input Tree:
                3
                / \
                5 1
                / \ / \
                6 2 0 8
                / \
                7 4
                p = 5, q = 1
    Output: 3
"""

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
        
input = [100,4,200,1,3,2]
def func(root, p, q):
    if root == p or root == q or root == None:
        return root

    lcaLeft = func(root.left, p, q)
    lcaRight = func(root.right, p, q)
    if lcaLeft != None and lcaRight != None:
        return root
    if lcaLeft == None:
        return lcaRight
    return lcaLeft

p = 5
q = 1
res = func(TreeNode(), p, q) # example node is to be sent
print(res)