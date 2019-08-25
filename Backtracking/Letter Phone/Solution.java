

    public class Solution {
        public ArrayList<String> letterCombinations(String A) {
            if(A.length() == 0) {
                return new ArrayList<>();
            }
            HashMap<Character, List<Character>> map = new HashMap<>();
            map.put('0', Arrays.asList('0'));
            map.put('1', Arrays.asList('1'));
            map.put('2', Arrays.asList('a','b','c'));
            map.put('3', Arrays.asList('d','e','f'));
            map.put('4', Arrays.asList('g','h','i'));
            map.put('5', Arrays.asList('j','k','l'));
            map.put('6', Arrays.asList('m','n','o'));
            map.put('7', Arrays.asList('p','q','r','s'));
            map.put('8', Arrays.asList('t','u','v'));
            map.put('9', Arrays.asList('w','x','y','z'));
            
            ArrayList<String> res = new ArrayList<>();
            StringBuilder str = new StringBuilder();
            
            recurse(A, map, res, str, 0);
            return res;
        }
        public void recurse(String A, HashMap<Character, List<Character>> map, ArrayList<String> res, StringBuilder str, int i) {
            if(i == A.length()) {
                res.add(str.toString());
                return;
            }
            for(int j = 0; j < map.get(A.charAt(i)).size(); j++) {
                Character mapChar = map.get(A.charAt(i)).get(j);
                str.append(mapChar);
                recurse(A, map, res, str, i+1);
                str.deleteCharAt(str.length()-1);
            }
        }
    }

