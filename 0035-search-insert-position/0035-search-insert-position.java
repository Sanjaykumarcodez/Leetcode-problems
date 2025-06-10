class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int a : nums){
            list.add(a);
        }
        list.add(target);
        Collections.sort(list);
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                break;
            }
            else{
                index++;
            }
        }
        return index;
    }
}