import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        String binary = Integer.toBinaryString(n);
        
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i) == '1')
            {
                ans++;                            // n값을 binary로 변환해준 뒤 나온 비트의 1의 개수를 구한다. == n의 값을 2로 계속 나누었을 때 나누어 떨어지지 않을 때만 ans++를 한다.
            }                             
        }
        return ans;
    }
}
