

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     public int val;
     *     public ListNode next;
     *     ListNode(int x) { val = x; next = null; }
     * }
     */
    public class Solution {
        public ListNode reverseBetween(ListNode A, int B, int C) {
            if(B>=C || B<1){
                return A;
            }
            ListNode curr = A;
            ListNode prev = null;
            ListNode save1 = null;
            ListNode save2 = null;
            ListNode save3 = null;
            ListNode save4 = null;
            int ind = 1;
            
            while(curr!=null) {
                if(ind == B) {
                    save1 = prev;
                    save2 = curr;
                } else if(ind == C+1) {
                    save3 = prev;
                    save4 = curr;
                    break;
                }
                prev = curr;
                curr = curr.next;
                ind++;
            }
            if(curr == null && ind == C+1 && prev != null) {
                save3 = prev;
                save4 = curr;
            }
            if(save2 == null || save3 == null) {
                return A;
            }
            save3.next = null;
            if(save1 != null) {
                save1.next = null;
                save1.next = reverseList(save2);
            } else {
                A = reverseList(save2);
            }
            
            curr = A;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = save4;
            
            return A;
            
        }
        public ListNode reverseList(ListNode A) {
            ListNode curr = A;
            ListNode prev = null;
            while(curr != null) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }
        
    }

