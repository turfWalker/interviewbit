public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        for(Integer i: A) {
            max = max > i.intValue() ? max : i.intValue();
        }
        if(max < 1) {
            return 1;
        }
        
        boolean[] arr = new boolean[max+1];
        int i = 0;
        for(i = 0; i < A.size(); i++) {
            if(A.get(i).intValue() > 0) {
                arr[A.get(i)] = true;
            }
        }
        i = 1;
        while(i < max + 1 && arr[i]) {
            i++;
        }
        return i;
    }
}