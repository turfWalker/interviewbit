

    public class Solution {
        public ArrayList<Integer> wave(ArrayList<Integer> A) {
            Collections.sort(A);
            // System.out.println(A);
            for(int i = 0; i < A.size(); i+=2) {
                if(i+1 < A.size()) {
                    int tmp = A.get(i);
                    A.set(i, A.get(i+1));
                    A.set(i+1, tmp);
                }
            }
            return A;
        }
    }

