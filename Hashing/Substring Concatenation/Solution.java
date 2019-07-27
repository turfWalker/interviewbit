

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public ArrayList<Integer> findSubstring(String A, final List<String> B) {
            ArrayList<Integer> res = new ArrayList<>();
            if(B == null || B.isEmpty() || A == null || A.length()==0) {
                return res;
            }
            
            HashMap<String, Integer> map = new HashMap<>();
            int strLen = B.get(0).length();
            for(String s: B) {
                if(map.containsKey(s)) {
                    map.put(s, map.get(s)+1);
                } else {
                    map.put(s, 1);
                }
            }
            for(int i = 0; i < A.length()-(strLen*B.size())+1; i++) {
                // System.out.println("running for i " + i + " " + set);
                if(isIndexValid(map, A.substring(i), strLen, B.size())) {
                    res.add(i);
                    
                }
                map = new HashMap<>();
                for(String s: B) {
                    if(map.containsKey(s)) {
                        map.put(s, map.get(s)+1);
                    } else {
                        map.put(s, 1);
                    }
                }
            }
            return res;
        }
        public boolean isIndexValid(HashMap<String,Integer> map, String s, int len, int maplen) {
            int currentIndex = 0;
            while(maplen>0) {
                String currString = getString(map, s.substring(currentIndex));
                
                if(currString == null) {
                    return false;
                }
                if(map.get(currString) == 1) {
                    map.remove(currString);
                } else {
                map.put(currString, map.get(currString)-1);
                    
                }
                currentIndex += len;
                // System.out.println("String found for " + currString + " " + set);
    maplen--;
            }
            return true;
        }
        
        public String getString(HashMap<String,Integer> map, String s) {
            // System.out.println("Running getString for " + s + " " + set);
            for(String str: map.keySet()) {
                if(s.indexOf(str) == 0) {
                    return str;
                }
            }
            return null;
        }
    }

