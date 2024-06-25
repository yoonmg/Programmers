import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0;i<moves.length;i++)
        {
            int pos = moves[i] - 1;
            
            for(int j=0;j<board.length;j++)
            {
                int doll = board[j][pos];
                
                if(doll != 0)
                {
                    board[j][pos] = 0;
                    
                    if(!stk.isEmpty() && stk.peek() == doll)  // 스택이 비어있지 않고 맨 위에 있는 인형과 막 뽑은 인형이 같으면 스택에 삽입 X
                    {
                        stk.pop();  // 맨 위에 있는 인형은 없애줌으로써 사라진다. 
                        answer += 2;  // 연속으로 같은 인형을 뽑으면 스택에 넣지 않고 넘어가기 때문에 사라진 인형의 총 갯수는 2개.
                    }
                    else
                    {
                        stk.add(doll);
                    }
                    
                    break;
                }
            }
        }
        return answer;
    }
}
