

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
        public TreeNode buildTree(ArrayList<Integer> A) {
            if(A == null || A.isEmpty()) {
                return null;
            }
            return recurse(A, 0, A.size()-1);
        }
        
        TreeNode recurse(ArrayList<Integer> A, int i, int j) {
            if(i > j || i < 0 || j >= A.size()) {
                return null;
            }
            int maxInd = max(A, i, j);
            TreeNode node = new TreeNode(A.get(maxInd));
            node.left = recurse(A, i, maxInd-1);
            node.right = recurse(A, maxInd+1, j);
            return node;
        }
        
        int max(ArrayList<Integer> A, int i, int j) {
            int maxVal = Integer.MIN_VALUE;
            int maxInd = -1;
            for(int k = i; k <= j; k++) {
                if(A.get(k) > maxVal) {
                    maxVal = A.get(k);
                    maxInd = k;
                }
            }
            return maxInd;
        }
    }

