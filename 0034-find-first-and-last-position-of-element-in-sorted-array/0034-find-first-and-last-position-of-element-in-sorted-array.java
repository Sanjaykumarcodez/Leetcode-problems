class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[] {-1,-1};
        if(nums == null || nums.length == 0){
            return arr;
        }
        int left = findFirst(nums, target);
        if (left == nums.length || nums[left] != target) {
            return arr;
        }
        arr[0] = left;
        arr[1] = findFirst(nums, target + 1) - 1;
        return arr;
    }
    private int findFirst(int[] nums, int target){
        int left = 0,right = nums.length;
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}


