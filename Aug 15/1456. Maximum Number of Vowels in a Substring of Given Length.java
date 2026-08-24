class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int[] arr = new int[n + 1];

        String vowels = "aeiou";

        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i];

            if (vowels.indexOf(s.charAt(i)) != -1) {
                arr[i + 1]++;
            }
        }

        int max = 0;

        for (int i = 0; i + k <= n; i++) {
            int count = arr[i + k] - arr[i];
            max = Math.max(max, count);
        }

        return max;
    }
}