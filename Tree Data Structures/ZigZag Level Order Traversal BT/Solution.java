

    /**
     * Definition for binary tree
     * class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) {
     *      val = x;
     *      left=null;
     *      right=null;
     *     }
     * }
     */
    public class Solution {
        public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            recurse(A, res, 0);
            return res;
        }
        public void recurse(TreeNode A, ArrayList<ArrayList<Integer>> res, int i) {
            // System.out.println(res);
            if(A == null) return;
            
            int len = res.size();
            for(int j = len; j <= i; j++) {
                res.add(new ArrayList<>());
            }
            
            if(i % 2 == 0) {
                res.get(i).add(A.val);
            } else {
                res.get(i).add(0, A.val);
            }
            recurse(A.left, res, i+1);
            recurse(A.right, res, i+1);
            
        }
    }

