"""
Don't understand question!
Example:
    Input: [10,9,2,5,3,7,101,18]
    Output: 4
        Example subsequence: [2,3,7,101]
"""
class Solution: 
    def func(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [1] * n
        for i in range(n):
            for j in range(i):
                if nums[i] > nums[j] and dp[i] < dp[j] + 1:
                    dp[i] = dp[j] + 1
        return max(dp)