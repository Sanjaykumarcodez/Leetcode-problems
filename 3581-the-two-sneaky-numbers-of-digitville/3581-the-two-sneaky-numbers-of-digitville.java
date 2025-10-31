class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        int pt=0;
        int cnt=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==2){
                arr[pt++]=i;
                cnt++;
            }
            if(cnt==2){
                break;
            }
        }
     return arr;
    }
}