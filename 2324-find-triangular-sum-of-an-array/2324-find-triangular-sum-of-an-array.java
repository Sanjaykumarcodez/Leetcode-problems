class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
        Queue<Integer> q = new LinkedList<>();
        for(int num : nums){
            q.add(num);
        }
        q.add(null);
        
        
        int sum=0;
        while(q.size()>1){
            if(q.peek()==null){
                q.add(q.poll());
            }
            else{
            int n1=q.poll();
            if(q.peek()!=null){
            int n2=q.peek();
             sum=(n1+n2)%10;
              q.add(sum);
            }
          
            }
            
        }
        return sum;
    }
}