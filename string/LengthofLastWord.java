public class Solution {
    public int lengthOfLastWord(final String A) {
        int length = 0;
        int i = A.length() - 1;
        while (i >= 0 && A.charAt(i) == ' ')
            i--;
        while (i >= 0 && A.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
