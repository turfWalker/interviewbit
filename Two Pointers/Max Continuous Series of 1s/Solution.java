

    public class Solution {
        public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
            int wL = 0;
            int wR = 0;
            int bestL = 0;
            int diff = 0;
            int zeroCount = 0;
            
            while(wR < A.size()) {
                if(zeroCount <= B) {
                    if(A.get(wR).intValue() == 0) {
                        zeroCount++;
                    }
                    wR++;
                }
                if(zeroCount > B) {
                    if(A.get(wL).intValue() == 0) {
                        zeroCount--;
                    }
                    wL++;
                }
                if(wR-wL > diff && zeroCount <= B) {
                    bestL = wL;
                    diff = wR-wL;
                }
            }
            ArrayList<Integer> res = new ArrayList<>();
            for(int i = bestL; i <= bestL+diff-1; i++) {
                res.add(i);
            }
            return res;
        }
    }

