public class Solution {
    public void arrange(ArrayList<Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            a.set(i, (a.get(i) + a.size() * (a.get(a.get(i)) % a.size())));
        }
        for(int i = 0; i < a.size(); i++) {
            a.set(i, (a.get(i) / a.size()));
        }
    }
}