"""
USING HEAP!
Example:
    Input:
        nums = [3,2,1,5,6,4]
        k = 2
    Output: 5
"""
nums = [3,2,1,5,6,4]
k = 3
def func(nums, k):
    import heapq as hq
    hq.heapify(nums)
    while len(nums)>k:
        hq.heappop(nums)
    return nums[0]

res = func(nums, k)
print(res)