

    public class Solution {
        public String simplifyPath(String A) {
            String[] arr = A.split("/");
            Stack<String> st = new Stack<>();
            for(int i = 0; i < arr.length; i++) {
                if((arr[i]).equals(".") || (arr[i]).length() == 0) {
                    //pass
                } else if((arr[i]).equals("..")) {
                    if(!st.isEmpty()) {
                        st.pop();
                    }
                } else {
                    st.push(arr[i]);
                }
            }
            StringBuilder res = new StringBuilder();
            while(!st.isEmpty()) {
                // System.out.println(st.peek());
                res.insert(0, "/");
                res.insert(0, st.pop());
                
            }
            if(res.length() == 0) {
                res.append("/");
            }
            res.insert(0, "/");
            
            // System.out.println(res);
            return res.substring(0, res.length()-1);
        }
    }

