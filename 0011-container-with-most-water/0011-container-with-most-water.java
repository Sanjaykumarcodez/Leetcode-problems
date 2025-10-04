class Solution {
    public int maxArea(int[] height) {
        int start = 0,end = height.length-1;
        int total = 0;
        while(start<end){
            int width = end - start;
            int heigh = Math.min(height[start],height[end]);
            int area = width*heigh;

            if(area>total){
                total = area;
            }

            if(height[start]<height[end]){
                start = start+1;
            }else{
                end = end - 1;
            }
        }
        return total;
    }
}