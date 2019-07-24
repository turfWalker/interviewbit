public class Solution {
    public int isPalindrome(int A) {
        String b = "" + A;
        int i = 0;
        int j = b.length()-1;
        while(i < j) {
            if(b.charAt(i) != b.charAt(j)) {
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}