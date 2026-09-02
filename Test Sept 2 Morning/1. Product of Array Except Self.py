"""
NOT use of division operator!
Example:
    Input: [1,2,3,4]
    Output: [24,12,8,6]
"""
input = [ 1,2,3,4 ]
def func(nums):
    prefix = [1]
    suffix = [1]
    for num in nums:
        prefix.append(prefix[-1]*num)
    for num in nums[::-1]:
        suffix.append(suffix[-1]*num)
    answer = []
    for i in range(len(nums)):
        answer.append( prefix[i] * suffix[-i-2] )
    return answer
        
res = func(input)
print(res)