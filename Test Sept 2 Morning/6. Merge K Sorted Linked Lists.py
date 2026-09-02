"""
adding all list and sorting them.
Example:
    Input: [[1,4,5],[1,3,4],[2,6]]
    Output: [1,1,2,3,4,4,5,6]
"""
class node():
    def __init__(val = 0):
        self.val = val
        self.next = None
        
input = [[1,4,5],[1,3,4],[2,6]]
def func(input):
    res = []
    for x in input:
        res += x
    return sorted(res)

res = func(input)
print(res)