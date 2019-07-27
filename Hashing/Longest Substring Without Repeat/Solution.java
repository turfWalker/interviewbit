

    public class Solution {
        public int lengthOfLongestSubstring(String A) {
            if(A==null || A.length()==0) return 0;
            if(A.length() == 1) return 1;
            
            HashSet<Character> set = new HashSet<>();
            int i = 0;
            int j = 1;
            int max = Integer.MIN_VALUE;
            set.add(A.charAt(i));
            
            while(j < A.length()) {
                if(set.contains(A.charAt(j))) {
                    max = (j-i) > max? (j-i): max;
                    for(int k = i;k<j;k++){
                        set.remove(A.charAt(k));
                        if(A.charAt(k) == A.charAt(j)) {
                            i=k+1;
                            break;
                        }
                    }
                }
                set.add(A.charAt(j));
                j++;
            }
            max = (j-i) > max? (j-i):max;
            return max;
            
        }
    }

