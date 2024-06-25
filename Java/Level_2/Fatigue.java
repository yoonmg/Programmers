class Solution {
    
    public static boolean[] visited;
    public static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];        //방문한 인덱스인지 아닌지 확인하기 위한 배열 생성
        DFS(k,dungeons,0);      
        return answer;
    }
    
    public static void DFS(int fatigue, int[][]dungeons, int cnt)
    {
        for(int i=0;i<dungeons.length;i++)
        {
            if(visited[i] == false && fatigue >= dungeons[i][0])        //i번째 던전의 최소 필요 피로도의 조건과 일치하고 방문하지 않은 인덱스이면 
            {
                visited[i] = true;                                      //방문했다고 표시한 후
                DFS(fatigue - dungeons[i][1], dungeons,cnt+1);          //소모 피로도만큼 소모된 피로도를 가지고 재귀함수를 통해 다음 던전을 방문하고 방문한 횟수를 +1한다. 이렇게 하면 첫번째 던전 방문 후 첫번째 던전은 true이기 때문에 넘어가고 두번째 던전을 방문할 수 있게 된다. 
                visited[i] = false;                                     //만약 끝까지 갔거나 더이상 조건을 만족할 수 없는 경우에는 true를 false로 초기화 해준다.                                      
            }
        }
        if(cnt >= answer)
        {
            answer = cnt;            //가장 많이 방문한 횟수를 저장한다.
        }
    }
}
