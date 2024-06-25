import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int[]people = new int[n];
        Stack<String>stack = new Stack<>();
        char start = words[0].charAt(0);
        
        for(int i=0;i<words.length;i++)
        {
            people[i % n]++;                //몇번의 사람이 몇번째로 말하는지 체크
            if(stack.contains(words[i]))
            {
                answer[0] = i % n + 1;
                answer[1] = people[i % n];                //만약 같은 말을 반복하면 break
                break;
            }
            else
            {
                stack.push(words[i]);   
            }
            
            if(start != words[i].charAt(0))
            {
                answer[0] = i % n + 1;
                answer[1] = people[i % n];              //앞글자와 이어지지 않는 글자가 나오면 break
                break;
            }
            else
            {
                start = words[i].charAt(words[i].length()-1);          //앞 단어의 마지막 글자를 저장
            }
        }
        return answer;
    }
}
