class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
       int n = words.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (groups[i] != groups[j] &&
                    words[i].length() == words[j].length() &&
                    hamming(words[i], words[j])) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        prev[i] = j;
                    }
                }
            }
        }

        int maxLen = 0, lastIndex = -1;
        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        LinkedList<String> result = new LinkedList<>();
        while (lastIndex != -1) {
            result.addFirst(words[lastIndex]);
            lastIndex = prev[lastIndex];
        }

        return result;
    }

    static boolean hamming(String a, String b) {
        if (a.length() != b.length()) return false;
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
                if (count > 1) return false;
            }
        }
        return count == 1;
    }
}