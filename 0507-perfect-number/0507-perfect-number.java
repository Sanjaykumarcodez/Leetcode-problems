class Solution {
    public boolean checkPerfectNumber(int num) {
        int dummy = num;
        int sum = 0;
        boolean res = true;
        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(dummy == sum){
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
}