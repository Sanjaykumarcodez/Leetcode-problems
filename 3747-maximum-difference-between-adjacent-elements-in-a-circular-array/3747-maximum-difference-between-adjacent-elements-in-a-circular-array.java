class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        for (int i = 0; i < nums.length; i++) {
            int nextIndex = (i + 1) % nums.length; 
            int diff = Math.abs(nums[i] - nums[nextIndex]);
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }
}