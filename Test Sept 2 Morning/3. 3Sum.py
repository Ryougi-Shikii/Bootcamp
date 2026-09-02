"""
NEED OPTIMIZATION!
Example:
    Input: [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
"""
input = [-1,0,1,2,-1,-4]
def func(nums):
    n = len(nums)
    res = []
    for i in range(n):
        for j in range(i+1, n):
            for k in range(j+1,n):
                if nums[i] + nums[j] + nums[k] == 0:
                    res.append([nums[i], nums[j], nums[k]])
    return res

res = func(input)
print(res)