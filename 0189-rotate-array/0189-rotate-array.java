class Solution {
    public void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k%n;
    //     int[] temp = new int[nums.length];
    //    for(int i=0;i<n;i++){
    //     temp[(i+k)%n] = nums[i];
    //    }
    //    for(int i=0;i<n;i++){
    //     nums[i] = temp[i];
    //    }
        k = k%nums.length;
        right(nums,0,nums.length-1);
        right(nums,0,k-1);
        right(nums,k,nums.length-1);
    
    }
    static void right(int [] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}