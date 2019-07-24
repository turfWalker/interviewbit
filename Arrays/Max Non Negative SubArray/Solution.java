public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        Long maxSum = 0L;
        int maxLength = 0;
        Long currSum = 0L;
        int currLength = 0;
        int currIndex = 0;
        int index = 0;
        for(int i = 0 ; i < A.size(); i++) {
            if(A.get(i) < 0) {
                if(currSum > maxSum || (currSum == maxSum && currLength > maxLength)) {
                    maxSum = currSum;
                    maxLength = currLength;
                    index = currIndex;
                }
                currSum = 0L;
                currLength = 0;
                currIndex = i + 1;
            } else {
                currSum += A.get(i);
                currLength++;
            }
        }
        if(currSum > maxSum || (currSum == maxSum && currLength > maxLength)) {
            index = currIndex;
        }
        for(int i = index ; i < A.size() && A.get(i) >= 0; i++) {
            result.add(A.get(i));
        }
        return result;
    }
}