

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            
            LinkedHashMap<String, ArrayList<Integer>> map = new LinkedHashMap<>();
            for(int i = 0; i < A.size(); i++) {
                char [] c = A.get(i).toCharArray();
                Arrays.sort(c);
                String tmp = new String(c);
                if(map.containsKey(tmp)) {
                    map.get(tmp).add(i+1);
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i+1);
                    map.put(tmp, list);
                }
            }
            for(Map.Entry<String, ArrayList<Integer>> entry: map.entrySet()) {
                res.add(entry.getValue());
            }
            return res;
        }
    }

