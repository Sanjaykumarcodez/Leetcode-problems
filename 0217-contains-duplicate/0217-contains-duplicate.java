class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean res = false;
        for(int num : nums){
            if(!set.add(num)){
                res = true;
            }
        }
        return res;
    }
}