class Solution {
    public int maxDifference(String s) {
        int[] arr  = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }
        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        for (int a : arr) {
            if (a == 0) continue;
            if (a % 2 == 0) {
                even = Math.min(even, a);
            } else {
                odd = Math.max(odd, a);
            }
        }
        if (odd == Integer.MIN_VALUE || even == Integer.MAX_VALUE) {
            return -1;
        }
        return odd-even;
    }
}