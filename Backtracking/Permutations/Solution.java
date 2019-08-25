

    public class Solution {
        public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
            if(A == null) return null;
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            if(A.size()==0) return res;
            
            ArrayList<Integer> tmp = new ArrayList<>();
            int i = 0;
            recurse(A, res, tmp, i);
            return res;
        }
        
        public void recurse(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp, int i) {
            if(i == A.size()) {
                res.add(new ArrayList<Integer>(tmp));
            }
            for(int j = 0; j<A.size(); j++) {
                if(tmp.contains(A.get(j))){
                    continue;
                }
                tmp.add(A.get(j));
                recurse(A, res, tmp, i+1);
                tmp.remove(tmp.size()-1);
            }
        }
    }

