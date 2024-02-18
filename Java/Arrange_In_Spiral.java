class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int row = 0;
        int col = 0;
        int dir = 0;    //0이면 오른쪽으로 1이면 아래로 2이면 오른쪽으로 3이면 위로
        
        for(int i=1;i<=n*n;i++)
        {
            answer[row][col] = i;
            
            if(dir == 0)
            {
                if(col + 1 < n && answer[row][col+1] == 0)  
                {
                    col++;
                }
                else //오른쪽으로 갈 때 범위를 벗어나거나 이미 다녀온 곳이라면 방향 바꾸기
                {
                    dir = 1;
                    row++;
                }
            }            
            else if(dir == 1)
            {
                if(row + 1 < n && answer[row+1][col] == 0)
                {
                    row++;
                }
                else //아래쪽으로 갈 때 범위를 벗어나거나 이미 다녀온 곳이라면 방향 바꾸기
                {
                    dir = 2;
                    col--;
                }
            }
            else if(dir == 2)
            {
                if(col - 1 >= 0 && answer[row][col-1] == 0)
                {
                    col--;
                }
                else //왼쪽으로 갈 때 범위를 벗어나거나 이미 다녀온 곳이라면 방향 바꾸기
                {
                    dir = 3;
                    row--;
                }
            }
            else if(dir == 3)
            {
                if(row - 1 >= 0 && answer[row-1][col] == 0)
                {
                    row--;
                }
                else //위쪽으로 갈 때 범위를 벗어나거나 이미 다녀온 곳이라면 방향 바꾸기
                {
                    dir = 0;
                    col++;
                }
            }
        }
        return answer;
    }
}
