class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int num : nums){
            if(num%2 == 0){
                l1.add(num);
            }
        }
        for(int num : nums){
            if(num%2 == 1){
                l2.add(num);
            }
        }
         int evenIdx = 0, oddIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = l1.get(evenIdx++);
            } else {
                nums[i] = l2.get(oddIdx++);
            }
        }
        return nums;
    }
}