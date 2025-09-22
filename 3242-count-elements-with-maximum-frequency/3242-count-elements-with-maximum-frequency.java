class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = 0;
        for(int i : map.keySet()){
            max = Math.max(max,map.get(i));
        }
        int result = 0;
        for(int i : map.keySet()){
            if(max == map.get(i)){
                result+= max;
            }
        }
        return result;
    }
}