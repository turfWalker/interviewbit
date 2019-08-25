

    public class Solution {
        public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            ArrayList<Integer> tmp = new ArrayList<>();
            Collections.sort(A);
            
            
            recurse(A, res, tmp, 0);
            return res;
        }
        
        public void recurse(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp, int i) {
            res.add(new ArrayList<Integer>(tmp));
            // System.out.println(res);
            // System.out.println("i: " + i);
     
            for(int j = i; j < A.size(); j++) {
                tmp.add(A.get(j));
                // System.out.println("Adding j " + j);
                // System.out.println(tmp);
                recurse(A, res, tmp, j+1);
                // System.out.println("Removing j " + j);
                tmp.remove(tmp.size()-1);
                // System.out.println(tmp);
            }
            
        }
    }

