public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        if(A == null) {
            return new ArrayList<Integer>();
        }
        
        
        while(A.size() > 0 && A.get(0).intValue() == 0) {
            A.remove(0);
        }
    
        if(A.size() == 0) {
            A.add(1);
            return A;
        }
        
        int i = A.size() - 1;
        if(A.get(i).intValue() < 9) {
            A.set(i, A.get(i) + 1);
            return A;
        }
        A.set(i, 0);
        i--;
        int carry = 1;
        while(i >= 0 && carry == 1) {
            if(A.get(i).intValue() < 9) {
                A.set(i, A.get(i) + 1);
                carry = 0;
            } else {
                A.set(i, 0);
            }
            i--;
        }
        
        if(carry == 1) {
            A.add(0, 1);
        }
        return A;
    }
}