public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        List<Integer> arr = new ArrayList<>();
        for(Integer i: A) {
            arr.add(i);
        }
        
        class CompareIntegers implements Comparator<Integer> {
            public int compare(Integer a, Integer b) {
                if(Long.parseLong(b + "" + a) > Long.parseLong(a + "" + b)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        
        Collections.sort(arr, new CompareIntegers());
        
        StringBuilder res = new StringBuilder();
        for(Integer i: arr) {
            res.append(i);
        }
        
        int i = 0;
        for(i = 0; i < res.length(); i++) {
            if(res.charAt(i) != '0') {
                break;
            }
        }
        if(i == res.length()){
            return "0";
        }
        return res.substring(i);
    }
}