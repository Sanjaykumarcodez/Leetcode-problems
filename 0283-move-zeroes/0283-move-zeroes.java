class Solution {
    public void moveZeroes(int[] nums) {
        // int ind = 0;
        // for(int num : nums){
        //     if(num != 0){
        //         nums[ind++] = num;
        //     }
        // }
        // while(ind<nums.length){
        //     nums[ind++] = 0;
        // }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int n : nums){
            if(n!= 0){
                l1.add(n);
            }else{
                l2.add(n);
            }
        }
        for(int n : l2){
            l1.add(n);
        }
        for(int i=0;i<l1.size();i++){
            nums[i] = l1.get(i);
        }
    }
}