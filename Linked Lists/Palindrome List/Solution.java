

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     public int val;
     *     public ListNode next;
     *     ListNode(int x) { val = x; next = null; }
     * }
     */
    public class Solution {
        public int lPalin(ListNode A) {
            if(A == null || A.next == null){
                return 1;
            }
            ListNode slow = A;
            ListNode fast = A;
            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode curr = slow;
            if(fast.next == null) {
                ListNode temp = curr;
                curr = curr.next;
                temp = null;
            } else {
                curr = curr.next;
            }
            
            ListNode prev = null;
            while(curr != null) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            
            while(prev != null) {
                if(A.val != prev.val) {
                    return 0;
                }
                A = A.next;
                prev = prev.next;
            }
            return 1;
            
            
            
            
            // String res = "";
            // while(A != null) {
            //     res += A.val;
            //     A = A.next;
            // }
            // return isPalindrome(res);
        }
        
        public int isPalindrome(String res) {
            int i = 0;
            int j = res.length()-1;
            while(i < j) {
                if(res.charAt(i) != res.charAt(j)) {
                    return 0;
                }
                i++;
                j--;
            }
            return 1;
        }
    }

