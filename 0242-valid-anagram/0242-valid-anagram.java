class Solution {
    public boolean isAnagram(String s, String t) {
        boolean res = true;
        if(s.length() != t.length());
        res = false;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)){
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
}