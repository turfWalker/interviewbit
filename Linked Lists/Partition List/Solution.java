

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     public int val;
     *     public ListNode next;
     *     ListNode(int x) { val = x; next = null; }
     * }
     */
    public class Solution {
        public ListNode partition(ListNode A, int B) {
            if(A == null) {
                return A;
            }
            
            ListNode smallH=null;
            ListNode smallP=null;
            ListNode largeH=null;
            ListNode largeP=null;
            ListNode curr = A;
            
            while(curr!=null) {
                ListNode tmp = new ListNode(curr.val);
                if(tmp.val < B) {
                    if(smallH == null) {
                        smallH = tmp;
                        smallP = tmp;
                    } else {
                        smallP.next = tmp;
                        smallP = tmp;
                    }
                } else {
                    if(largeH == null) {
                        largeH = tmp;
                        largeP = tmp;
                    } else {
                        largeP.next = tmp;
                        largeP = tmp;
                    }
                }
                curr = curr.next;
            }
            if(smallH == null) {
                return largeH;
            } else if(largeH == null) {
                return smallH;
            } else {
                smallP.next = largeH;
                return smallH;
            }
        }
    }

