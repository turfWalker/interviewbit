

    /**
     * Definition for binary tree
     * class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public TreeNode flatten(TreeNode a) {
            // recurse(a);
            // return a;
            if(a==null) return null;
            TreeNode node = a;
            TreeNode right = flatten(node.right);
            node.right = flatten(node.left);
            node.left = null;
            while(node.right!=null) node = node.right;
            node.right = right;
            
            return a;
     
        }
        public void recurse(TreeNode a){
            if(a== null || (a.left==null && a.right==null)) return;
            if(a.left != null) {
                recurse(a.left);
                TreeNode tmp = a.right;
                a.right = a.left;
                a.left = null;
                TreeNode curr = a.right;
                while(curr.right != null) {
                    curr = curr.right;
                }
                curr.right = tmp;
            }
            recurse(a.right);
        }
        
    }

