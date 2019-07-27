

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     public int val;
     *     public ListNode next;
     *     ListNode(int x) { val = x; next = null; }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode a) {
            if(a == null || a.next == null) {
                return a;
            }
            ListNode s = a;
            ListNode f = a;
            boolean loopFound = false;
            while(f.next != null && f.next.next != null) {
                s = s.next;
                f = f.next.next;
                if(s == f) {
                    loopFound = true;
                    break;
                }
            }
            if(loopFound == false) {
                return null;
            }
            ListNode c = a;
            while(s != c) {
                s = s.next;
                c = c.next;
            }
            return s;
        }
    }

