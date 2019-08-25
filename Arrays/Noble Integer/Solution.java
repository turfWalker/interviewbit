public class Solution {
    public int solve(ArrayList<Integer> A) {
        if(A == null || A.size() == 0) {
            return -1;
        }
        Collections.sort(A);
        int curr = A.get(A.size() - 1);
        for(int i = A.size() - 1; i >= 0; i--) {
            if(curr == A.size() - i - 1) {
                return 1;
            }
            while(i >= 0 && curr == A.get(i)) {
                i--;
            }
            if(i < 0) {
                break;
            }
            curr = A.get(i);
            i++;
        } 
        return -1;
    }
}