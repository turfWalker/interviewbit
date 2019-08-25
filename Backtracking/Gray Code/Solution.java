

    public class Solution {
        public ArrayList<Integer> grayCode(int a) {
            ArrayList<Integer> res = new ArrayList<>();
            if(a < 1) return res;
            if(a == 1) {
                res.add(0);
                res.add(1);
                return res;
            }
            
            ArrayList<StringBuilder> list = new ArrayList<>();
            list.add(new StringBuilder("0"));
            list.add(new StringBuilder("1"));
            a--;
            while(a > 0) {
                int lstSize = list.size();
                for(int i = lstSize-1; i >=0; i--) {
                    list.add(new StringBuilder(list.get(i).toString()));
                }
                String currString = "0";
                for(int i = 0; i<2*lstSize; i++){
                    if(i == lstSize) currString = "1";
                    list.set(i, list.get(i).insert(0, currString));
                }
                
                a--;
            }
            for(StringBuilder sb: list) {
                res.add(Integer.parseInt(sb.toString(), 2));
            }
            return res;
        }
    }

