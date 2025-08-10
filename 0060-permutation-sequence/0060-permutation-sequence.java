class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=n;i++){
            list.add(i);
            fact *= i;
        }
        k--;

        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            fact /= i; 
            int index = k / fact;
            sb.append(list.get(index));
            list.remove(index);
            k %= fact;
        }
        
        return sb.toString();
    }
}