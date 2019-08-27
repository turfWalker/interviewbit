

    public class Solution {
        final int ALPHABET_SIZE = 26;
        
        class Trie {
            class TrieNode {
                TrieNode[] children = new TrieNode[ALPHABET_SIZE];
                boolean isEOW;
                TrieNode() {
                    isEOW = false;
                    for(int i = 0; i < ALPHABET_SIZE; i++) {
                        children[i] = null;
                    }
                }
            }
            TrieNode root;
            Trie() {
                root = new TrieNode();
            }
            void insert(String key) {
                TrieNode curr = root;
                for(int i = 0; i < key.length(); i++) {
                    int index = key.charAt(i) - 'a';
                    if(curr.children[index] == null) {
                        curr.children[index] = new TrieNode();
                    }
                    curr = curr.children[index];
                }
                curr.isEOW = true;
            }
            boolean search(String key) {
                TrieNode curr = root;
                for(int i = 0; i < key.length(); i++) {
                    int index = key.charAt(i) - 'a';
                    if(curr.children[index] == null) {
                        return false;
                    }
                    curr = curr.children[index];
                }
                return (curr != null && curr.isEOW);
            }
            
        }
        
        public ArrayList<Integer> solve(String A, ArrayList<String> B) {
            Trie trie = new Trie();
            for(String str: A.split("_")) {
                trie.insert(str);
            }
            Map<Integer, List<Integer>> map = new TreeMap<>(Collections.reverseOrder());
            
            for(int i = 0; i < B.size(); i++) {
                int count = 0;
                for(String child: B.get(i).split("_")) {
                    if(trie.search(child)) {
                        count++;
                    }
                }
                List<Integer> lst = new ArrayList<Integer>();
                if(map.get(count) != null)
                    lst.addAll(map.get(count));
                lst.add(i);
                map.put(count, lst);
            }
            
            ArrayList<Integer> res = new ArrayList<Integer>();
            for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
                res.addAll(entry.getValue());
            }
            
            return res;
        }
    }

