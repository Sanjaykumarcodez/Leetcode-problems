class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
         List<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(new int[]{nums[i], i});
        }
        list.sort((a, b) -> b[0] - a[0]);
        List<int[]> topK = list.subList(0, k);
        topK.sort((a, b) -> a[1] - b[1]);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = topK.get(i)[0];
        }
        return res;
    }
}