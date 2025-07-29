class Solution {
    public int findMin(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    nums[j]=nums[i]+nums[j];
                    nums[i]=nums[j]-nums[i];
                    nums[j]=nums[j]-nums[i];

                }
            }
        }
        return nums[0];
    }
}