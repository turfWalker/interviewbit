

    public class Solution {
        public int threeSumClosest(ArrayList<Integer> A, int B) {
            Collections.sort(A);
            long min = Integer.MAX_VALUE;
            long res = 0;
            
            for(int i = 0; i < A.size() - 2; i++) {
                int j = i+1;
                int k = A.size()-1;
                while(j < k) {
                    long sum = (long) A.get(i) + (long) A.get(j) + (long) A.get(k);
                    if(Math.abs(sum-B) < min) {
                        min = Math.abs(sum-B);
                        res = sum;
                    }
                    if(sum > B) {
                        k--;
                    } else {
                        j++;
                    }
                }
                if(min == 0) {
                    break;
                }
            }
            return (int)res;
        }
    }

