class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        ArrayList<Integer> al=new ArrayList<>();
        while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            al.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            al.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
             al.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            al.add(matrix[i][left]);
        }
        left++;
        }
        }
        return al;
    }
}