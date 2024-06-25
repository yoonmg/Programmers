import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = -1;
        int index = 0;
        Integer[]arr = new Integer[citations.length];
      
        for(int i=0;i<citations.length;i++)
        {
            arr[i] = citations[i];
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] <= i)
            {
                answer = i;
                break;
            }
        }
        if(answer == -1)
        {
            answer = citations.length;
        }
        return answer;
    }
}
