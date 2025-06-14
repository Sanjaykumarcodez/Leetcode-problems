class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        for(int X : nums1){
            for(int y : nums2){
                if(X==y){
                    l.add(X);
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int x : l){
            set.add(x);
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for(int x : set){
            arr[i++] = x;
        }
        return arr;
    }
}