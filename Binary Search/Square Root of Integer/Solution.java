public class Solution {
    public int sqrt(int a) {
        if(a == 0) return 0;
        int start = 1;
        int end = a;
        while(start <= end) {
            int mid = (start + end) /2;
            if(mid == a / mid) {
                return mid;
            } else if(mid < a / mid) {
                if((mid+1) > a/(mid+1)) {
                    return mid;
                }
                start = mid+1;
            } else {
                if((mid-1)< a/(mid-1)) {
                    return mid-1;
                }
                end = mid-1;
            }
        }
        return 1;
    }
}