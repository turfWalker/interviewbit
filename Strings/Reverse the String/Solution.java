

    public class Solution {
        public String reverseWords(String a) {
            if(a==null || a.length()==0) return "";
            String[] arr = a.split(" ");
            StringBuilder res = new StringBuilder();
            for(int i = arr.length-1; i >=0; i--) {
                StringBuilder tmp = new StringBuilder(arr[i]);
                // tmp.reverse();
                res.append(tmp);
                res.append(" ");
                // System.out.println(res);
            }
            return res.substring(0,res.length()-1);
        }
    }

