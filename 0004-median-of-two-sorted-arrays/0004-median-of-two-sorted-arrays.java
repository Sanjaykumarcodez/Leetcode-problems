class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length+nums2.length;
        int[] arr = new int[l];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        for(int i=0;i<l;i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        double res = 0;
        if(l%2 == 0){
            res = (arr[l/2-1]+arr[l/2])/2.0;
        } 
        else{
            res = arr[l/2];
        }

        return res;      
    }
}