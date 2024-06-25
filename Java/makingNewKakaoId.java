class Solution {
    public String solution(String new_id) 
    {
        // 모든 대문자를 소문자로 만들기
        String answer = new_id.toLowerCase();

        // 소문자, 숫자, -, ., _를 제외한 모든 문자 제거
        answer = answer.replaceAll("[^a-z0-9\\-\\._]", "");

        // .이 두번 이상 반복되면 하나로 줄이기
        answer = answer.replaceAll("\\.{2,}", ".");

        // 문자열의 시작 혹은 끝이 .이면 제거
        answer = answer.replaceAll("^\\.{1,}|\\.{1,}$", "");

        // 만약 문자열의 길이가 0이면 a를 추가
        if(answer.length() == 0)
        {
            answer += "a";
        }

        // 만약 문자열의 길이가 16 이상이면 문자열의 길이가 15가 될 때까지 맨 마지막 문자 제거
        if(answer.length() >= 16)
        {
            while(answer.length() >= 16)
            {
                answer = answer.replaceAll(".$", "");
            }
        }

        // 위 과정 후에 .이 문자열 앞 또는 뒤에 있는 경우 제거
        answer = answer.replaceAll("^\\.{1,}|\\.{1,}$", "");

        // 만약 문자열의 길이가 2 이하라면 문자열의 길이가 3이 될 때까지 문자열의 마지막 문자열을 더하기
        if(answer.length() <= 2)
        {
            while(answer.length() <= 2)
            {
                answer += answer.charAt(answer.length() - 1);
            }
        }
        return answer;
    }
}
