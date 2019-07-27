

    public class Solution {
        public int colorful(int A) {
            if(A < 10) {
                return 1;
            }
            String s = A + "";
            if(s.contains("1") || s.contains("0")) {
                return 0;
            }
            
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i < s.length(); i++) {
                if(set.contains(Integer.parseInt(s.charAt(i)+""))){
                    return 0;
                }
                set.add(Integer.parseInt(s.charAt(i)+""));
            }
            
            for(int i =2; i <= s.length(); i++) {
                for(int j = 0; j < s.length() -i; j++) {
                    int res = 1;
                    int count = i;
                    int index = j;
                    
                    while(count > 0) {
                        res *= Integer.parseInt(s.charAt(index)+"");
                        count--;
                        index++;
                    }
                    
                    if(set.contains(res)) {
                        return 0;
                    }
                    set.add(res);
                }
            }
            
            return 1;
        }
    }

