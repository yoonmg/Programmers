import java.util.*;

class Solution {
    public Vector solution(int[] progresses, int[] speeds) {
        Vector<Integer>answer = new Vector<>();
        Stack<Integer>stack = new Stack<>();
        int[]arr = new int[progresses.length];
        int index = 1;
        
        for(int i=0;i<progresses.length;i++)
        {
            if((100 - progresses[i]) % speeds[i] == 0)
            {
                arr[i] = (100 - progresses[i]) / speeds[i];
            }
            else                                                      //기능개발에 걸리는 시간을 계산 및 배열에 삽입
            {
                arr[i] = (100 - progresses[i]) / speeds[i] + 1;
            }
            
            if(stack.isEmpty())
            {
                stack.push(arr[i]);
            }
            else if(stack.peek() < arr[i])
            {
                stack.push(arr[i]);                                        //먼저 들어가 있던 원소가 뒤에 들어가는 원소보다 작을경우 스택에 삽입 후 추가
                answer.add(index);
                index = 1;
            }
            else if(stack.peek() >= arr[i])
            {
                index++;                                                  //그렇지 않을 경우 스택에 삽입하지 않고 index만 증가 
            }
        }
        answer.add(index);                                        //마지막에 남은 index까지 추가 후 return
        return answer;
    }
}
