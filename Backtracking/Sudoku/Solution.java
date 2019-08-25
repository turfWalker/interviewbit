

    public class Solution {
        public void solveSudoku(ArrayList<ArrayList<Character>> a) {
            if(a.isEmpty()) {
                return;
            }
            recurse(a);
        }
        public boolean isSafe(ArrayList<ArrayList<Character>> a, int r, int c, int num) {
            for(int i = 0; i<9; i++) {
                if(a.get(r).get(i)==(num+"").charAt(0)){
                    return false;
                }
            }
            for(int i = 0; i<9; i++) {
                if(a.get(i).get(c)==(num+"").charAt(0)){
                    return false;
                }
            }
            int sqrt = 3; 
            int boxRowStart = r - r % sqrt; 
            int boxColStart = c - c % sqrt; 
      
        for (int row = boxRowStart; row < boxRowStart + sqrt; row++)  
        { 
            for (int d = boxColStart;  
                     d < boxColStart + sqrt; d++)  
            { 
                if (a.get(row).get(d) == (Character)(num+"").charAt(0))  
                { 
                    return false; 
                } 
            } 
        } 
          return true; 
        }
        
        public boolean recurse(ArrayList<ArrayList<Character>> a) {
            int r = -1;
            int c = -1;
            boolean isEmpty = true;
            for(int i =0; i < 9; i++){
                for(int j =0;j<9;j++) {
                    if(a.get(i).get(j) == '.') {
                        r = i;
                        c = j;
                        isEmpty = false;
                        break;
                    }
                }
                if(!isEmpty){
                    break;
                }
            }
            if(isEmpty){
                return true;
            }
            for(int num = 1; num<=9; num++) {
                if(isSafe(a, r, c, num)) {
                    a.get(r).set(c, (num+"").charAt(0));
                    if(recurse(a)) {
                        return true;
                    } else {
                        a.get(r).set(c, '.');
                    }
                }
            }
            return false;
        }
    }

