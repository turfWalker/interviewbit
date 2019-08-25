public class Solution {
    public int solve(String A) {
        int sum = 0;
        for(int i = 0; i < A.length(); i++) {
            if(isVowel(A.charAt(i))) {
                sum += A.length() -i;
            }
        }
        
        return sum%10003;
    }
    
    public boolean isVowel(char x) {
        x = Character.toLowerCase(x);
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            return true;
        }
        return false;
    }
}