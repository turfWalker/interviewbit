

    public class Solution {
        public String fractionToDecimal(int x, int y) {
            long A = x;
            long B = y;
            if(A==0) return "0";
            if(B==0) return "";
            StringBuilder sb = new StringBuilder();
            if((A>0 && B<0) || (A<0 && B>0)) sb.append("-");
            A = Math.abs(A);
            B = Math.abs(B);
            sb.append(A/B);
            long rem = (A%B)*10;
            if(rem == 0) return sb.toString();
            sb.append(".");
            
            HashMap<Long,Integer> map = new HashMap<>();
            while(rem!=0) {
                if(map.containsKey(rem)) {
                    sb.insert(map.get(rem), "(");
                    sb.append(")");
                    return sb.toString();
                }
                map.put(rem, sb.length());
                sb.append(rem/B);
                rem = (rem%B)*10;
            }
            
            return sb.toString();
        }
    }

