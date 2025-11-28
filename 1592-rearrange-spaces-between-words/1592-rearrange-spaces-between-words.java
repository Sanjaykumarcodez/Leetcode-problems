class Solution {
    public String reorderSpaces(String text) {
        int n = text.length();
        StringBuilder words = new StringBuilder();
        int totalSpaces = 0;

        for (int i = 0; i < n; ) {
            while (i < n && text.charAt(i) == ' ') i++;
            int j = i;
            while (j < n && text.charAt(j) != ' ') j++;
            if (j > i) {
                if (words.length() > 0) words.append('|');
                words.append(text.substring(i, j));
            }
            i = j;
        }

        for (int i = 0; i < n; i++) if (text.charAt(i) == ' ') totalSpaces++;

        String[] parts = words.toString().split("\\|");
        int wordCount = 0;
        for (String w : parts) if (!w.isEmpty()) wordCount++;

        int spacesBetween = 0;
        int trailingSpaces = 0;
        if (wordCount > 1) {
            spacesBetween = totalSpaces / (wordCount - 1);
            trailingSpaces = totalSpaces % (wordCount - 1);
        } else {
            trailingSpaces = totalSpaces;
        }

        StringBuilder result = new StringBuilder();
        String spaceBetweenStr = " ".repeat(Math.max(0, spacesBetween));

        boolean firstWordPlaced = false;
        for (String w : parts) {
            if (w.isEmpty()) continue;
            if (firstWordPlaced) result.append(spaceBetweenStr);
            result.append(w);
            firstWordPlaced = true;
        }

        if (trailingSpaces > 0) result.append(" ".repeat(trailingSpaces));

        return result.toString();

    }
}