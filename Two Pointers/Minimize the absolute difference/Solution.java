

    public class Solution {
        public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
            int i = A.size()-1;
            int j = B.size()-1;
            int k = C.size()-1;
            int min = Integer.MAX_VALUE;
            
            while(i >=0 && j>=0 && k>=0) {
                min = Math.min(min, Math.max(Math.max(A.get(i), B.get(j)), C.get(k))-Math.min(Math.min(A.get(i), B.get(j)), C.get(k)));
                if(A.get(i) > B.get(j) && A.get(i) > C.get(k)) {
                    i--;
                } else if(B.get(j) > C.get(k)) {
                    j--;
                } else{
                    k--;
                }
            }
            return min;
        }
    }

