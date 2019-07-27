public class Solution {
    public String convert(String A, int B) {
        if(B==1) {
            return A;
        }
        ArrayList<String> lst= new ArrayList<>();
        for(int i = 0; i < B; i++) {
            lst.add(new String(""));
        }
        
        int lsIndex = 0;
        boolean inc = true;
        for(int i = 0; i < A.length(); i++) {
            lst.set(lsIndex, lst.get(lsIndex)+A.charAt(i));
            if(inc) {
                lsIndex++;
            } else {
                lsIndex--;
            }
            if(lsIndex ==B) {
                lsIndex = B-2;
                inc=false;
            } else if(lsIndex == -1) {
                lsIndex=1;
                inc=true;
            }
        }
        String res = "";
        for(String i: lst) {
            res += i;
        }
        
        return res;
    }
}