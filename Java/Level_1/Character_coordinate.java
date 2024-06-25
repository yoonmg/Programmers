class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

      /* 보드 크기가 주어졌을 때 보드의 중심을 (0,0)으로 잡은 뒤, up, down, left, right를 이용해 범위를 벗어나지 않는 선에서 
      움직인 후의 캐릭터의 현재 좌표를 출력*/
      
        for(int i=0;i<keyinput.length;i++)
        {
          // 나누기 2를 하는 이유는 중심이 (0,0)이기 때문에 만약 가로 길이가 5인 경우 (-2,0), (2,0) 까지로 정해짐
            if(keyinput[i].equals("up") && answer[1] < board[1] / 2)
            {
                answer[1]++;
            }
            if(keyinput[i].equals("down") && answer[1] > -(board[1] / 2))
            {
                answer[1]--;
            }
            if(keyinput[i].equals("left") && answer[0] > -(board[0] / 2))
            {
                answer[0]--;
            }
            if(keyinput[i].equals("right") && answer[0] < board[0] / 2)
            {
                answer[0]++;
            }
        }
        return answer;
    }
}
