class Solution {
    static int root(int n){
        int sum = 0;
        while(n!=0){
            int num = n%10;
            sum+=num*num;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = root(n);

        while(fast != 1 && slow!=fast){
            slow = root(slow);
            fast = root(root(fast));
        }
        return fast == 1;
    }
}