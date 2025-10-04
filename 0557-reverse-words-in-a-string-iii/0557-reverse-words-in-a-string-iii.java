class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String res = "";
        for(int i=0;i<arr.length;i++){
            arr[i] = swap(arr[i]);
        }
        for(String x : arr){
            res += x+" ";
        }
        return res.trim();
    }

    static String swap(String str){
        char[] arr = str.toCharArray();
        int left = 0,right = arr.length-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String res = "";
        for(char c : arr){
            res += c;
        }
        return res;
    }
}