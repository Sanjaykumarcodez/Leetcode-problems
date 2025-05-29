class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List <Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    int left=list.get(i-1).get(j-1);
                    int right = list.get(i-1).get(j);
                    int res = left+right;
                    row.add(res);
                }
            }
            list.add(row);
        }
        return list.get(rowIndex);
    }
}