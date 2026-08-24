class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])
        result = [intervals[0]]
        for s, e in intervals[1:]:
            start, end = result.pop()
            if s<=end:
                result.append([start, max(e,end)])
            else:
                result.append([start, end])
                result.append([s, e])
        return result