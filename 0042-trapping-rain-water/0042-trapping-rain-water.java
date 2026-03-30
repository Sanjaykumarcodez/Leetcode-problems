class Solution {
    public int trap(int[] height) {
        int water = 0;
        int lb = 0;
        int rb = height.length - 1;
        int lmax = height[lb];
        int rmax = height[rb];

        while(lb < rb){
            if(lmax < rmax){
                lb++;
                lmax = Math.max(lmax,height[lb]);
                water += lmax - height[lb];
            }else{
                rb--;
                rmax = Math.max(rmax,height[rb]);
                water += rmax - height[rb];
            }
        }
        return water;
    }
}