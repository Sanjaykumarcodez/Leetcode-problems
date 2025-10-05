class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>=2){
                result = entry.getKey();
            }
        }
        return result;
    }
}