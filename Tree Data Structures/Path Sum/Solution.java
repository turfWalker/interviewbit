

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
        boolean found; 
        public int hasPathSum(TreeNode A, int B) {
            // if(A== null && B == 0) return 1;
            // else if(A == null) return 0;
            
            // found = false;
            // recurse(A, B, 0);
            // return found? 1:0;
            if(A == null) return 0;
            if(A.left == null && A.right == null && B == A.val) return 1;
            
            int res = 0;
            if(A.left != null) {
                res = hasPathSum(A.left, B - A.val);
            }
            if(res == 0 && A.right != null) {
                res = hasPathSum(A.right, B - A.val);
            }
            return res;
        }
        
        public void recurse(TreeNode A, int B, int sum) {
            if(found) return;
            sum += A.val;
            
            if(A.left != null) {
                recurse(A.left, B, sum);
            }
            if(A.right != null) {
                recurse(A.right, B, sum);
            }
            if(A.left == null && A.right == null && sum == B) {
                found = true;
            }
        }
    }

