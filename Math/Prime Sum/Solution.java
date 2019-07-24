public class Solution {
    public ArrayList<Integer> primesum(int A) {
        boolean[] barr = new boolean[A+1];
        
        for(int i = 2; i < A+1; i++) {
            barr[i] = true;
        }
        
        for(int i = 2; i <= Math.sqrt(A); i++) {
            if(barr[i]) {
                for(int j = 2; i*j <= A; j++) {
                    barr[i*j] = false;
                }
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 2; i < A+1; i++) {
            if(barr[i] && barr[A-i]) {
                res.add(i);
                res.add(A-i);
                return res;
            }
        }
        return res;
    }
}