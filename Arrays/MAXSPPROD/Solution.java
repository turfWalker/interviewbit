public class Solution {
    public int maxSpecialProduct(ArrayList<Integer> A) {
        if(A.size() < 3) {
            return 0;
        }
        
        int[] left = new int[A.size()];
        int[] right = new int[A.size()];
        
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < A.size(); i++) {
            while(!st.isEmpty() && A.get(i) >= A.get(st.peek())) {
                st.pop();
            }
            if(st.isEmpty()) {
                left[i] = 0;
            } else {
                left[i] = st.peek();
            }
            st.push(i);
        }
        
        st = new Stack<>();
        for(int i = A.size() - 1 ; i >= 0; i--) {
            while(!st.isEmpty() && A.get(i) >= A.get(st.peek())) {
                st.pop();
            }
            if(st.isEmpty()) {
                right[i] = 0;
            } else {
                right[i] = st.peek();
            }
            st.push(i);
        }
        
        
        
        long maxValue = 0L;
        long currValue = 0L;
        for(int i = 0; i < A.size(); i++) {
            if(left[i] == 0 || right[i] == 0) {
                currValue = 0L;
            } else {
                currValue = 1L*left[i]*right[i];
            }
            if(currValue > maxValue) {
                maxValue = currValue;
            }
        }
        return (int) (maxValue%1000000007L);
    }
}