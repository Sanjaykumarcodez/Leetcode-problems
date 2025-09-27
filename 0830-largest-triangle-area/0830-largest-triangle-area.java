class Solution {
    public double largestTriangleArea(int[][] points) {
        double max = Double.MIN_VALUE;
        int len = points.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                for(int k=j+1;k<len;k++){
                    double area = Math.abs( 
                        points[i][0]*(points[j][1]-points[k][1])+
                        points[j][0]*(points[k][1]-points[i][1])+
                        points[k][0]*(points[i][1]-points[j][1])
                    )/2.0;

                    max = Math.max(max,area);
                }
            }
        }
        return max;

    }
}