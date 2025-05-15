class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        
        List<String> sol = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(i==0 || (groups[i] != groups[i-1])){
                sol.add(words[i]);
            }
        }
        return sol;
    }
}