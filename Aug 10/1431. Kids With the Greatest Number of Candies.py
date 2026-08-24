class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        res=[]
        m= max(candies)
        for i in candies:
            present=i + extraCandies
            if present>=m:
                res.append(True)
            else:
                res.append(False)
        return res