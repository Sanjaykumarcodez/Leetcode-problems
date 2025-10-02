class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        for (char word : text.toCharArray()) {
            if(word == 'b' || word == 'a' || word == 'l' || word == 'o' || word == 'n'){
                freq[word - 'a']++;
            }
        }

        freq['l' - 'a'] /= 2;
        freq['o' - 'a'] /= 2;

        int total = Math.min(freq['b' - 'a'], 
                    Math.min(freq['a' - 'a'], 
                    Math.min(freq['l' - 'a'], 
                    Math.min(freq['o' - 'a'], freq['n' - 'a']))));

        return total;
    }
}
