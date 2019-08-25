public class Solution {
    public int isPalindrome(String A) {
        String b = A.toLowerCase();
        int i = 0;
        int j = b.length()-1;
    
        while(i < j) {
            if(!Character.isLetterOrDigit(b.charAt(i))) {
                i++;
            } else if(!Character.isLetterOrDigit(b.charAt(j))) {
                j--;
            } else {
                if(b.charAt(i) != b.charAt(j)) {
                    return 0;
                }
                i++;
                j--;
            }
        }
        return 1;
        
    }
}