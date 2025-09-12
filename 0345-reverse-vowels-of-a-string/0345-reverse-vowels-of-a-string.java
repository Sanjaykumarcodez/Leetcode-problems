class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','U','O'));

        char[] arr = s.toCharArray();
        int left = 0,right = arr.length-1;

        while(left<right){
            while(left<right && !set.contains(arr[left])){
                left++;
            }
            while(left<right && !set.contains(arr[right])){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right--;
        }
        return new String(arr);
    }
}