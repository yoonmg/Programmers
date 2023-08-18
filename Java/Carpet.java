class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = brown + yellow;
        for(int i=3;i<=width;i++)
        {
            int a = width / i;
            if(i >= a && width % i == 0 && (i-2)*(a-2) == yellow) //i-2 == yellow의 가로 길이, a-2 == yellow의 세로 길이
            {
                answer[0] = i;
                answer[1] = a;
                break;
            }
        }
        return answer;
    }
}
