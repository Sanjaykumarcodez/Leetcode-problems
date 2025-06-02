class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int n = nums.length;
        for(int i=0;i<=n/2;i++){
            res = nums[i];
        }
        return res;
    }
}