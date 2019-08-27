

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
        int kval;
        int count;
        public int kthsmallest(TreeNode A, int B) {
            kval = -1;
            count = B;
            inorder(A);
            return kval;
        }
        
        public void inorder(TreeNode A) {
            if(A == null || count < 0) return;
            inorder(A.left);
            count--;
            // System.out.println("Processing " + A.val + " " + count);
            if (count == 0) {
                kval = A.val;
                return;
            }
            inorder(A.right);
        }
    }

