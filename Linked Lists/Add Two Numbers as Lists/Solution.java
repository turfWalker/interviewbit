

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     public int val;
     *     public ListNode next;
     *     ListNode(int x) { val = x; next = null; }
     * }
     */
    public class Solution {
        public ListNode addTwoNumbers(ListNode A, ListNode B) {
            int carry = 0;
            ListNode currA = A;
            ListNode currB = B;
            ListNode head = null;
            ListNode prevH = null;
            String str = "";
     
            while(currA!= null || currB!=null) {
                int aval = 0;
                if(currA!=null) {
                    aval = currA.val;
                    currA = currA.next;
                }
                int bval = 0;
                if(currB!=null) {
                    bval = currB.val;
                    currB = currB.next;
                }
                int sum = aval+bval+carry;
                if(sum > 9) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                ListNode temp = new ListNode(sum%10);
                str += (sum%10);
                if(head == null) {
                    head = temp;
                    prevH = temp;
                } else {
                    prevH.next = temp;
                    prevH = temp;
                }
            }
            if(carry == 1) {
                ListNode temp = new ListNode(1);
                prevH.next = temp;
                str += "1";
            }
            
            int i = str.length() -1;
            int count = 0;
            while(i>=0) {
                if(str.charAt(i)!= '0') {
                    break;
                }
                count++;
                i--;
            }
            if(count ==0) {
                return head;
            }
            ListNode f = head;
            ListNode s = head;
            while(f!=null) {
                f=f.next;
                if(count <= 0) {
                    s=s.next;
                }
                
                count--;
            }
            s.next=null;
            
            return head;
            
        }
    }

