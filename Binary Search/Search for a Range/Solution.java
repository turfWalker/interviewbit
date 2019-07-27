public class Solution {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(searchFirstOccurence(a, b));
        if(res.get(0) == -1) {
            res.add(-1);
            return res;
        }
        res.add(searchLastOccurence(a,b));
        return res;
        
    }
    
    public int searchFirstOccurence(final List<Integer> a, int b) {
        int s = 0;
        int e = a.size()-1;
        while(s <= e) {
            int m = (s+e)/2;
            if(a.get(m) == b) {
                if(m > 0 && a.get(m-1) == b) {
                    e = m-1;
                } else {
                    return m;
                }
            } else if(a.get(m) > b) {
                e = m-1;
            } else {
                s = m+1;
            }
        }
        return -1;
    }
    public int searchLastOccurence(final List<Integer> a, int b) {
        int s = 0;
        int e = a.size()-1;
        while(s <= e) {
            int m = (s+e)/2;
            if(a.get(m) == b) {
                if(m < a.size()-1 && a.get(m+1) == b) {
                    s = m+1;
                } else {
                    return m;
                }
            } else if(a.get(m) > b) {
                e = m-1;
            } else {
                s = m+1;
            }
        }
        return -1;
    }
}