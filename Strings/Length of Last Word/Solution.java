public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        int j = A.length() - 1;
        while(j >= 0 && A.charAt(j) == ' ') {
            j--;
        }
        if(j < 0) {
            return 0;
        }
        
        for(int i = j; i >=0; i--) {
            if(A.charAt(i) == ' ') {
                return j - i;
            }
        }
        return j + 1;
    }
}