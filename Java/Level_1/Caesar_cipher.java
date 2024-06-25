class Solution {
    public String solution(String s, int n) {
        char[]arr = s.toCharArray();
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 32)
            {
                continue;     //공백문자 스킵
            }
            
            arr[i] = (char)(arr[i] + n);
            if((int)arr[i] > 90 && Character.isUpperCase(arr[i] - n))
            {
                arr[i] = (char)(arr[i] - 26);       //대문자끼리만 계산후 변환
            }
            else if((int)arr[i] > 122 && Character.isLowerCase(arr[i] - n))
            {
                arr[i] = (char)(arr[i] - 26);       //소문자끼리만 계산 후 변환
            }
        }
        String answer = new String(arr);
        return answer;
    }
}
