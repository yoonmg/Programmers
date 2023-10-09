import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int priority : priorities) 
        {
            queue.offer(priority);            //배열 내에 있는 원소를 모두 큐에 삽입
        }

        while (!queue.isEmpty()) 
        {
            int current = queue.poll();
            boolean isPrinted = true;          //맨 앞에 있는 원소를 갖고 나온다.

            for (int priority : queue) 
            {
                if (priority > current) 
                {
                    isPrinted = false;            //만약 반환한 원소의 값보다 큰 값이 큐에 존재하는 경우 break문으로 탈출하고 큰 값이 존재한다는걸 isPrinted 변수를 통해 알린다.
                    break;
                }
            }

            if (isPrinted) 
            {
                answer++;
                if (location == 0) 
                {
                    break;                      //큰 값이 존재하지 않는다면 프로세스의 횟수를 1회 증가시키고, 만약 그 원소가 내가 가리켰던 원소라면 while문을 탈출하고 종료한다.
                }
            }
            else 
            {
                queue.offer(current);          //큰 값이 존재한다면 반환환 원소를 다시 큐에 집어넣는다.
            }

            location = (location - 1 + queue.size()) % queue.size();          //반환한 값이 내가 가리켰던 원소가 아니라면 내가 가리키는 원소의 위치를 한칸 내려준다.
        }
        return answer;
    }
}
