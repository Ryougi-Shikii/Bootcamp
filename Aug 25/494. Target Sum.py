class Solution:
    def findTargetSumWays(self, nums: list[int], target: int) -> int:
        n = len(nums)
        memo = {}

        def dp(i: int, current_sum: int) -> int:
            if i == n:
                return 1 if current_sum == target else 0

            state = (i, current_sum)
            if state in memo:
                return memo[state]

            add = dp(i + 1, current_sum + nums[i])
            sub = dp(i + 1, current_sum - nums[i])

            memo[state] = add + sub
            return memo[state]

        return dp(0, 0)