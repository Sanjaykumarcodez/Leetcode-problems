class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();

        int prev = 0;

        for(int i = 0;i<spaces.length;i++){
            sb.append(s,prev,spaces[i]);
            sb.append(" ");
            prev = spaces[i];
        } 

        sb.append(s.substring(prev));
         return sb.toString();
    }
}