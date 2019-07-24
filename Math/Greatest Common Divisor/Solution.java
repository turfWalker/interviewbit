public class Solution {
    public int gcd(int A, int B) {
        if(A == 0) {
            return B;
        }
        if(B == 0) {
            return A;
        }
        for(int i = Math.min(A,B); i > 0; i--) {
            if(A%i == 0 && B%i ==0){
                return i;
            }
        }
        return 1;
    }
}