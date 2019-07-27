

    public class Solution {
        public int findMinXor(ArrayList<Integer> A) {
            int min =Integer.MAX_VALUE;
            Collections.sort(A);
            for(int i = 0; i < A.size()-1; i++) {
                // for(int j = i+1; j < A.size(); j++) {
                    min = Math.min(min, A.get(i) ^ A.get(i+1));
                // }
            }
            
            return min;
        }
    }

