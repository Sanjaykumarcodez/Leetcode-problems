class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<=n;i++){
            l.add(i);
        }
        for(int num : nums){
            l.add(num);
        }
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int m : l){
            if(!s1.add(m)){
                s2.add(m);
            }
        }
        int res = 0;
        for(int m : l){
            if(!s2.contains(m)){
                res = m;
            }
        }
        return res;
    }
}