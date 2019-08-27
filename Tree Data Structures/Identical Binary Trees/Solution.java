

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
        public int isSameTree(TreeNode A, TreeNode B) {
            if(A == null && B == null) {
                return 1;
            } else if(A == null || B == null) {
                return 0;
            }
            if(A.val != B.val) {
                return 0;
            }
            return (isSameTree(A.left, B.left) == 1 && isSameTree(A.right, B.right) == 1)? 1:0;
        }
    }

