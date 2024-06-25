class Solution {
    public int solution(int n) {
        int x = 0;
        int y = 1;
        int z = 1;
        
        for(int i=3;i<=n;i++)
        {
            x = (y + z) % 1234567;
            y = z;
            z = x;
        }
        
        return x;
        
    }
}
