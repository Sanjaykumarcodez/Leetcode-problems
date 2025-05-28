class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        if(x<0){
            return false;
        }
        int result = 0;
        while(x!=0){
            int res = x%10;
            result = result*10+res;
            x/=10;
        }
        return y == result;
    }
}