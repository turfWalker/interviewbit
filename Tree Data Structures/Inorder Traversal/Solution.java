

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
        public ArrayList<Integer> inorderTraversal(TreeNode A) {
            ArrayList<Integer> res = new ArrayList<>();
            if(A==null) return res;
            
            Stack<TreeNode> st = new Stack<>();
            TreeNode curr = A;
            
            while(curr != null || !st.isEmpty()) {
                while(curr != null) {
                    st.push(curr);
                    curr = curr.left;
                }
                curr = st.pop();
                res.add(curr.val);
                curr = curr.right;
            }
            
            return res;
        }
    }

