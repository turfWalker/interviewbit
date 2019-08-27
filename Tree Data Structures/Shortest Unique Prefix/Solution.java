

    public class Solution {
        class Trie {
            class TrieNode {
                TrieNode[] child = new TrieNode[26];
                boolean iseow;
                public TrieNode() {
                    iseow = false;
                    for(int i = 0; i < 26; i++) {
                        child[i] = null;
                    }
                }
            }
            TrieNode root;
            Trie() {
                root = new TrieNode();
            }
            void insert(String key) {
                TrieNode node = root;
                for(int i = 0; i < key.length(); i++) {
                    int index = key.charAt(i) - 'a';
                    if(node.child[index] == null) {
                        node.child[index] = new TrieNode();
                    }
                    node = node.child[index];
                }
                node.iseow = true;
            }
            String getSubstring(String key) {
                TrieNode node = root;
                StringBuilder res = new StringBuilder();
                int lastGreaterCountIndex = -1;
                for(int i = 0; i < key.length(); i++) {
                    // res.append(key.charAt(i));
                    // System.out.println(res.toString());
                    int count = 0;
                    node = node.child[key.charAt(i) - 'a'];
                    for(int j = 0; j < 26; j++) {
                        if(node.child[j] != null) {
                            count++;
                        }
                    }
                    if(count > 1) {
                        lastGreaterCountIndex = i;
                    }
                    // if (count == 1) {
                    //     break;
                    // }
                    
                }
                // if(lastGreaterCountIndex == -1) lastGreaterCountIndex = -1;
                
                return key.substring(0, lastGreaterCountIndex +2);
            }
        }
        
        
        
        public ArrayList<String> prefix(ArrayList<String> A) {
            Trie trie = new Trie();
            for(String str: A) {
                trie.insert(str);
            }
            ArrayList<String> res = new ArrayList<>();
            for(String str: A) {
                res.add(trie.getSubstring(str));
            }
            return res;
            
        }
    }

