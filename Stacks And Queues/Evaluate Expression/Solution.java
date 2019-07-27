

    public class Solution {
        public int evalRPN(ArrayList<String> A) {
            Stack<Integer> st = new Stack<>();
            int res = 0;
            for(String i: A) {
                if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")) {
                    int b = st.pop();
                    int a = st.pop();
                    if(i.equals("+")) {
                        res = a+b;
                    } else if(i.equals("-")) {
                        res = a-b;
                    } else if(i.equals("*")) {
                        res = a*b;
                    } else if(i.equals("/")) {
                        res = a/b;
                    }
                    st.push(res);
                } else {
                    st.push(Integer.parseInt(i));
                }
            }
            return st.pop();
        }
    }

