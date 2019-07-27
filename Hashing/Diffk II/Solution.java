

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public int diffPossible(final List<Integer> A, int B) {
            HashSet<Integer> set = new HashSet<>();
            for(Integer i: A) {
                if(set.contains(i+B) || set.contains(i-B)) {
                    return 1;
                }
                set.add(i);
            }
            return 0;
        }
    }

