class Solution {
    public int maxDifference(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        // Find maximum odd frequency and minimum even frequency
        for (int f : freq) {
            if (f == 0) {
                continue;
            }

            if (f % 2 == 0) {
                minEven = Math.min(minEven, f);
            } else {
                maxOdd = Math.max(maxOdd, f);
            }
        }

        return maxOdd - minEven;
    }
}