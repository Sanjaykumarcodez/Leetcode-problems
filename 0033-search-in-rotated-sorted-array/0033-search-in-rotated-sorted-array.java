class Solution {
    public int search(int[] nums, int target) {
        int index = 0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                flag = true;
                break;
            }else{
                index++;
            }
        }
        int res = 0;
        if(flag){
            res = index;
        }else{
            res = -1;
        }
        return res;
    }
}