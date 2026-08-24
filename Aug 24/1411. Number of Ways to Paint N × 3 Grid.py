class Solution:
    def numOfWays(self, n: int) -> int:
        MOD = 10**9 + 7
        
        # Base state for n = 1
        type_a = 6  # ABC patterns
        type_b = 6  # ABA patterns
        
        for _ in range(2, n + 1):
            next_a = (2 * type_a + 2 * type_b) % MOD
            next_b = (2 * type_a + 3 * type_b) % MOD
            type_a, type_b = next_a, next_b
            
        return (type_a + type_b) % MOD