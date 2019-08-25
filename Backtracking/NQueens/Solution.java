

    public class Solution {
        
        public ArrayList<ArrayList<String>> solveNQueens(int a) {
            ArrayList<ArrayList<String>> res = new ArrayList<>();
            if(a < 1) {
                return res;
            }
            
            ArrayList<ArrayList<Integer>> allComb = new ArrayList<>();
            ArrayList<Integer> currList = new ArrayList<>();
            recurse(a, allComb, currList, 0);
            
            if(allComb.isEmpty()) {
                return res;
            }
            
            for(ArrayList<Integer> arr: allComb) {
                ArrayList<String> tmp = new ArrayList<>();
                for(int i = 0; i < arr.size(); i++) {
                    int c = arr.get(i);
                    StringBuilder sb=new StringBuilder();
                    for(int k = 0; k < arr.size(); k++) {
                        if(c==k){
                            sb.append("Q");
                        } else{
                            sb.append(".");
                        }
                    }
                    tmp.add(sb.toString());
                }
                res.add(tmp);
            }
            return res;
        }
        
        public void recurse(int a, ArrayList<ArrayList<Integer>> all, ArrayList<Integer> curr, int queen) {
            if(queen == a) {
                if(curr.size() == a) {
                    ArrayList<Integer> tmp = new ArrayList<>();
                    for(Integer i: curr) {
                        tmp.add(i);
                    }
                    all.add(tmp);
                }
                return;
            }
            for(int col = 0; col < a; col++) {
                if(isSafe(curr, col, queen)) {
                    curr.add(col);
                    recurse(a, all, curr, queen+1);
                    curr.remove(curr.size()-1);
                }
            }
        }
        
        public boolean isSafe(ArrayList<Integer> curr, int col, int queen) {
            if(curr.contains(col)) {
                return false;
            }
            
            for(int r = 0; r < queen; r++) {
                int c = curr.get(r);
                if(Math.abs(r-queen) == Math.abs(c-col)){
                    return false;
                }
            }
            return true;
        }
    }

