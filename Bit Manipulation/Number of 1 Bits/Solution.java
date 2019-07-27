

    public class Solution {
        public int numSetBits(long a) {
            int count = 0;
            while(a >0) {
                if(a%2 == 1) {
                    count++;
                }
                a /= 2;
            }
            return count;
        }
    }

