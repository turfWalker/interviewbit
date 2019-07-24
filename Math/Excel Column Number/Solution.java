public class Solution {
    public int titleToNumber(String A) {
        int sum = 0;
        
        for(int i = 0; i < A.length(); i++) {
            sum += (A.charAt(i) - 64) * Math.pow(26, A.length() - i - 1);
            
        }
        
        return sum;
    }
}