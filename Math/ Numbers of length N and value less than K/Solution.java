public class Solution {
    public int solve(ArrayList<Integer> A, int B, int C) {
        
        int na = A.size();
        if (na == 0)
            return 0;
    
        boolean[] flag = new boolean[10];
        for(int i = 0; i < na; i++)
            flag[A.get(i)] = true;
    
        String s = "" + C;
        if(B > s.length())   
            return 0;
        else if(B < s.length())
        {
            if(B==1)
                return na;
            return ((int)Math.pow(na, B-1))*(A.get(0) == 0 ? na-1 : na);
        }
    
        int ans = 0;
        for(int i = 0; i < B; i++)
        {
            for(int j = 0; j < (s.charAt(i)-'0'); j++)
            {
                if((i == 0 && j == 0) ||  !flag[j])
                    continue;
                ans += Math.pow(na, B-i-1);
            }
            if(!flag[s.charAt(i)-'0'])
                break;
        }
        if(flag[0] && C > 0 && 1 == B)
            ans++;
        return ans;
    }  
} 