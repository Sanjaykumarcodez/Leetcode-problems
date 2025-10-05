class Solution {
    public int findKthLargest(int[] nums, int k) {
        // List<Integer> list = new ArrayList<>();
        // for(int num : nums){
        //     if(!list.contains(num)){
        //         list.add(num);
        //     }
        // }
        // int[] temp = new int[list.size()];
        // int i = 0;
        // for(int num : list){
        //     temp[i++] = num;
        // }
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}