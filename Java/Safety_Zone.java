class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] row = {-1, -1, -1, 0, 0, 1, 1, 1}; //행 기준 상하좌우 대각선
        int[] col = {-1, 0, 1, -1, 1, -1, 0, 1}; //열 기준 상하좌우 대각선
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j] == 1)  //만약 해당 좌표에 폭탄이 있다면
                {
                    for(int k=0;k<row.length;k++)
                    {
                        int a = row[k] + i;    
                        int b = col[k] + j;    
                        
                        if(a >= 0 && a < board.length && b >= 0 && b < board.length) //해당 좌표의 상하좌우 대각선이 board 크기 안에 있는지 확인
                        {
                            if(board[a][b] == 0)    //만약 안에 있다면 해당 좌표의 값이 0인지 아닌지 확인 (해당 좌표가 0이 아닌 폭탄일 수도 있기 때문)
                            {
                                board[a][b] = 2;    //폭탄 주변의 지역의 값은 0 또는 1을 제외한 아무 값이나 가능
                            }
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<board.length;i++)          //위험지대를 모두 확인 후 안전 지대 확인
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j] == 0)
                {
                    answer++;
                }
            }
        }
        return answer;
    }
}
