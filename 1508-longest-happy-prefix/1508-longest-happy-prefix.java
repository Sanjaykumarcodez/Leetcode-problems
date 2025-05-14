class Solution {
    public String longestPrefix(String s) {
        int[] lps = new int[s.length()];
        int prev = 0;
        int i = 1;

        while(i<s.length()){
            if(s.charAt(i) == s.charAt(prev)){
                lps[i] = prev + 1;
                prev ++;
                i ++;
            }
            else if(prev == 0){
                lps[i] = 0;
                i++;
            }
            else{
                prev = lps[prev-1];
            }
        }
        return s.substring(0,lps[lps.length-1]);
    }
}