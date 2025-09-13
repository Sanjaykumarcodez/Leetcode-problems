class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int i =0;
        for(int num : nums){
            if(num == target){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}