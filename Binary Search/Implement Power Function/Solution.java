public class Solution {
    public int pow(int x, int n, int d) {
        if(x == 0) {
            return 0;
        }
        if(n == 0) {
            return 1%d;
        }
        int res = 1;
        x = x%d;
        while(n>0) {
            if(n%2 == 1) {
                res = (int)((1L * res * x) %d);
            }
            n = n/2;
            x = (int)((1L * x*x)%d);
        }
        if(res < 0) {
            res += d;
        }
        return res;
    }
}