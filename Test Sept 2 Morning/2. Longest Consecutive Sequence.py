"""
Example:
    Input: [100,4,200,1,3,2]
    Output: 4
"""
input = [100,4,200,1,3,2]
def func(nums):
    numset = set(nums)
    longest = 0
    for n in numset:
        if n - 1 not in numset:
            length = 1
            while n + length in numset:
                length += 1
            longest = max(longest, length)
    return longest

res = func(input)
print(res)