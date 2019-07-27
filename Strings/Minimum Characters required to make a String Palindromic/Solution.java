public class Solution {
    public int solve(String A) {
        char[] arr = A.toCharArray();
        for(int j = arr.length-1; j >0; j--) {
            if(isPalindrome(arr, j)) {
                return arr.length - j-1;
            }
        }
        return arr.length-1;
    }
    
    public boolean isPalindrome(char[] arr, int j) {
        int i = 0;
        while(i < j) {
            if(arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}