class Solution {
    public String gcdOfStrings(String str1, String str2) {

        // Check if both strings have a common pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD of lengths
        int gcd = findGCD(str1.length(), str2.length());

        // Return the common string
        return str1.substring(0, gcd);
    }

    public int findGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}