class Solution {
    public int strStr(String haystack, String needle) {
         if(needle.equals("")){
          return 0;
          }

       // build LPS array
       int [] lps = new int [needle.length()];
       int prev = 0;
       int i = 1;

       while(i < needle.length()){
         if(needle.charAt(i) == needle.charAt(prev)){
            lps[i] = prev + 1;
            prev++;
            i++;
         }
         else{
            if(prev == 0){
                lps[i] = 0;
                i++;
            }
            else{
                prev = lps[prev-1];
            }
         }
       }

        // KMP search

        i = 0; // haystack
        int j = 0; // needle

        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j == 0){
                    i++;
                }
                else{
                    j = lps[j-1];
                }
            }

            if (j == needle.length()){
                return i-j;
            }

        }
        return -1;
    }
}