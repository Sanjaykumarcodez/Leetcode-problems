class Solution {
    public int maximumProduct(int[] nums) {
        int result = 1;
        Arrays.sort(nums);
        int n = nums.length;
        
        int a = nums[n-1]*nums[n-2]*nums[n-3];
        int b = nums[0]*nums[1]*nums[n-1];

        return Math.max(a,b);
    }
}