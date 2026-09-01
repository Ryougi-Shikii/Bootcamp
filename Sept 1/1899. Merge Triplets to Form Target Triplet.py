class Solution:
    def mergeTriplets(self, triplets: List[List[int]], target: List[int]) -> bool:
        
        res = [0, 0, 0]
        x, y, z = target

        for source in triplets:
            a, b, c = source
            if a<=x and b<=y and c<=z:
                res[0] = max(a, res[0])
                res[1] = max(b, res[1])
                res[2] = max(c, res[2])
            if res==target:
                return True
    
        return res == target