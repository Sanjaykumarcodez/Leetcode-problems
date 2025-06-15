class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int num : nums){
            if(num%2 == 0){
                l1.add(num);
            }
            else{
                l2.add(num);
            }
        }
        int i = 0;
        for(int n : l1){
            nums[i++] = n;
        }
        for(int m : l2){
            nums[i++] = m;
        }
        return nums;
    }
}