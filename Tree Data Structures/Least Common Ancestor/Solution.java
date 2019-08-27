

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
        public int lca(TreeNode A, int B, int C) {
            if(A == null) return -1;
            if(search(A,B) == false || search(A,C) == false) return -1;
            TreeNode res = lcaUtil(A, B, C);
            return res != null ? res.val : -1;
            
        }
        
        public boolean search(TreeNode A, int elem) {
            if(A == null) return false;
            if(A.val == elem) return true;
            return search(A.left, elem) || search(A.right, elem);
        }
        
        public TreeNode lcaUtil(TreeNode A, int B, int C) {
            if (A == null) return null;
            if(A.val == B || A.val == C) {
                return A;
            }
            TreeNode l = lcaUtil(A.left, B, C);
            TreeNode r = lcaUtil(A.right, B, C);
            if(l != null && r != null) {
                return A;
            }
            return l != null ? l : r;
        }
    }

