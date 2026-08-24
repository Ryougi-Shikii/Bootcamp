class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
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
        