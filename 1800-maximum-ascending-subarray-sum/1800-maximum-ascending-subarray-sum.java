class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum = 0;
                boolean ascending = true;

                for(int k=i;k<=j;k++){

                    if(k > i && nums[k] <= nums[k-1]){
                        ascending = false;
                        break;
                    }
                    sum += nums[k];
                }
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}