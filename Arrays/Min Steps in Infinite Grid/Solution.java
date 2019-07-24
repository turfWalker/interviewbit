public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps = 0;
        if(A.size() < 2) {
            return steps;
        }
        for(int i = 1; i < A.size(); i++) {
            steps += Math.max(Math.abs(A.get(i)-A.get(i-1)), Math.abs(B.get(i)-B.get(i-1)));
        }
        return steps;
    }
}