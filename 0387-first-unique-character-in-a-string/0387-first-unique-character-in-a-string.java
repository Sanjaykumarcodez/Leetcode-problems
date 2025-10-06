class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = 0;
        for(char c : s.toCharArray()){
            if(map.get(c) == 1){
                return count; 
            }else{
                count++;
            }
        }
        return count == 1 ? count : -1;
    }
}