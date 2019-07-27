

    public class Solution {
        public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
            Stack<Integer> st = new Stack<>();
            ArrayList<Integer> res = new ArrayList<>();
            for(int i = 0; i < A.size(); i++) {
                while(!st.isEmpty() && A.get(i) <= st.peek()) {
                    st.pop();
                }
                if(st.isEmpty()) {
                    res.add(-1);
                } else {
                    res.add(st.peek());
                }
                st.push(A.get(i));
            }
            return res;
        }
    }

