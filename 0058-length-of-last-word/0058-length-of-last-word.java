class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split("\\s");
        int length = word.length;
        int result = word[length-1].length();
        return result;

    }
}