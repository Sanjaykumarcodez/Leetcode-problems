class Solution {
    public int[] countBits(int n) {
        int m = n+1;
        int[] result = new int[m];
        for(int i=0;i<m;i++){
            String b = Integer.toBinaryString(i);
            String clean = b.replaceAll("0","");
            int len = clean.length();
            result[i] = len;
        }
        return result;
    }
}