

    public class Solution {
        public ArrayList<ArrayList<String>> partition(String a) {
            if(a == null || a.length() == 0) {
                return null;
            }
            ArrayList<ArrayList<String>> res = new ArrayList<>();
            ArrayList<String> tmp = new ArrayList<>();
     
            recurse(a, res, tmp, 0);
            return res;
        }
        
        public void recurse(String a, ArrayList<ArrayList<String>> res, ArrayList<String> tmp, int i) {
            
            if(i >= a.length()) {
                res.add(new ArrayList<>(tmp));
                return;
            }
            for(int j = i; j<a.length(); j++) {
                if(isPalindrome(a,i,j)) {
                    // System.out.println(i+ " " + j);
                    tmp.add(a.substring(i, j+1));
                    recurse(a, res, tmp, j+1);
                    tmp.remove(tmp.size()-1);
                }
            }
        }
        
        public boolean isPalindrome(String s, int i, int j) {
            while(i < j) {
                if(s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }

