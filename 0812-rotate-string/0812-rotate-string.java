class Solution {
    public boolean rotateString(String s, String goal) {
        String cpy = s+s;
        if(s.length() == goal.length() && cpy.contains(goal)){
            return true;
        }
        return false;
    }
}