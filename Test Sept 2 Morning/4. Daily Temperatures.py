"""
USING MONOTONIC STACK!
Example:
    Input: [73,74,75,71,69,72,76,73]
    Output: [1,1,4,2,1,1,0,0]
"""
input = [73,74,75,71,69,72,76,73]
def func(temperatures):
    n = len(temperatures)
    res = [0] * n
    stack = []

    for i in range(n):
        while stack and temperatures[stack[-1]] < temperatures[i]:
            res[stack[-1]] = i - stack[-1]
            stack.pop(-1)
        stack.append(i)

    return res

res = func(input)
print(res)