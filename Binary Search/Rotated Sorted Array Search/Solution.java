public class Solution {
    // DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int b) {
        if(a.size() == 0) {
            return -1;
        } else if(a.size() == 1) {
            if(a.get(0) == b) {
                return 0;
            } else {
                return -1;
            }
        }
        int s = 0;
        int e = a.size() -1;
        int pivot = 0;
        while(s <= e) {
            int m = (s+e)/2;
            if(m-1>=0 && a.get(m-1)>a.get(m)) {
                pivot = m-1;
                break;
            } else if(m+1<a.size() && a.get(m+1)<a.get(m)) {
                pivot = m;
                break;
            } else {
                if(a.get(s) > a.get(m)) {
                    e = m-1;
                } else {
                    s = m+1;
                }
            }
        }
        
        s =0;
        e =a.size()-1;
        if(b == a.get(pivot)) {
            return pivot;
        } else if(b < a.get(e)) {
            s = pivot+1;
        } else{
            e = pivot-1;
        }
        while(s<=e) {
            int m = (s+e)/2;
            if(b == a.get(m)){
                return m;
            } else if(b < a.get(m)) {
                e = m-1;
            } else {
                s=m+1;
            }
        } 
        return -1;
    }
}