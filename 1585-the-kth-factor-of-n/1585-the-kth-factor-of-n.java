class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                l1.add(i);
            }
        }
        int count = 0;
        if(l1.size()<k){
            count = -1;
        }else {
            count = l1.get(k-1);
        }
        return count;
    }
}