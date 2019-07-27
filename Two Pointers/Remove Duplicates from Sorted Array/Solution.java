

    public class Solution {
        public int removeDuplicates(ArrayList<Integer> a) {
            for(int i = a.size()-1; i >0; i--) {
                if(a.get(i).intValue() == a.get(i-1).intValue()) {
                    a.remove(i);
                }
            }
            return a.size();
        }
    }

