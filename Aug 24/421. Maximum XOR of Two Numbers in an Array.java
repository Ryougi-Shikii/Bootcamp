class Solution {
    static class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }

    private final TrieNode root = new TrieNode();

    private void insert(int num) {
        TrieNode curr = root;
        for (int i = 30; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (curr.children[bit] == null) {
                curr.children[bit] = new TrieNode();
            }
            curr = curr.children[bit];
        }
    }

    private int findMaxXor(int num) {
        TrieNode curr = root;
        int maxXor = 0;
        for (int i = 30; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int oppositeBit = 1 - bit;

            // Greedily choose opposite bit if available to set the i-th bit to 1
            if (curr.children[oppositeBit] != null) {
                maxXor |= (1 << i);
                curr = curr.children[oppositeBit];
            } else {
                curr = curr.children[bit];
            }
        }
        return maxXor;
    }

    public int findMaximumXOR(int[] nums) {
        for (int num : nums) {
            insert(num);
        }

        int maxResult = 0;
        for (int num : nums) {
            maxResult = Math.max(maxResult, findMaxXor(num));
        }

        return maxResult;
    }
}