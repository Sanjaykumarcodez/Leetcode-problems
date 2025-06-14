class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int x : nums){
            if(!s1.add(x)){
                s2.add(x);
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int x : nums){
            if(!s2.contains(x)){
                l.add(x);
            }
        }
        int n = l.size();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = l.get(i);
        }
        return arr;
    }
}