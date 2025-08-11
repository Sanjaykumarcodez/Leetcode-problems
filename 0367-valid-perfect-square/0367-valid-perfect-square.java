class Solution {
    public boolean isPerfectSquare(int num) {
        double sq = Math.sqrt(num);

        if(sq == Math.floor(sq)){
            return true;
        }

        return false;
    }
}