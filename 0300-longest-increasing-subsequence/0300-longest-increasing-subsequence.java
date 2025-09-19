class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        Arrays.fill(temp,1);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    temp[i] = Math.max(temp[i],temp[j]+1);
                }
            }
        }
        int res = 0;
        for(int i=0;i<=n-1;i++){
            res = Math.max(res,temp[i]);
        }
        return res;
    }
}