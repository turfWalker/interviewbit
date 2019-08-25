

    class Solution {
        List<Integer> st;
        List<Integer> q;
        int min;
        
        Solution() {
            st = new ArrayList<>();
            q = new ArrayList<>();
            min = Integer.MAX_VALUE;
        }
        public void push(int x) {
            st.add(x);
            if(x <= min) {
                min = x;
                q.add(x);
            }
            // System.out.println("Pushed " + x);
        }
     
        public void pop() {
            if(st.size() != 0) {
                int elem = st.get(st.size() - 1);
                st.remove(st.size() -1);
                if(elem == min) {
                    if(q.size() != 0)
                        q.remove(q.size()-1);
                    if(q.size() != 0)
                        min = q.get(q.size()-1);
                    else
                        min = Integer.MAX_VALUE;
                    
                }
            }
            // System.out.println("Popped");
        }
     
        public int top() {
            if(st.isEmpty()) {
                return -1;
            }
            // System.out.println("Top " + st.get(st.size() - 1));
            return st.get(st.size() - 1);
        }
     
        public int getMin() {
            if(min == Integer.MAX_VALUE){
                return -1;
            }
            // System.out.println("Min " + min);
            return min;
        }
    }

