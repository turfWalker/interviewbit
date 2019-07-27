

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public int trap(final List<Integer> A) {
            int[] l = new int[A.size()];
            int[] r = new int[A.size()];
            
            l[0] = A.get(0);
            for(int i = 1; i < A.size(); i++)
                l[i] = Math.max(A.get(i),l[i-1]);
            r[A.size()-1] = A.get(A.size()-1);
            for(int i = A.size()-2; i >= 0; i--)
                r[i] = Math.max(A.get(i), r[i+1]);
                
            int res=0;
            for(int i=0;i<A.size();i++){
                res+= Math.min(l[i],r[i]) - A.get(i);
            }
            return res;
        }
    }

