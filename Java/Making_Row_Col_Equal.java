class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = null;  //2차원 배열 초기화
        
        if(arr.length > arr[0].length)    //만약 행의 갯수가 열의 갯수보다 많으면
        {
            answer = new int[arr.length][arr.length];    //2차원 배열의 크기를 모두 행의 갯수로 할당한 후
            
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    answer[i][j] = arr[i][j];    //주어진 배열의 값들을 모두 넣는다. 배열의 크기를 할당할 때 따로 원소의 값들을 정해주지않으면 0이 들어가는 것을 이용.
                }
            }
        }
        else if(arr.length < arr[0].length)  //만약 열의 갯수가 행의 갯수보다 많다면 
        {
            answer = new int[arr[0].length][arr[0].length];  //2차원 배열의 크기를 모두 열의 갯수로 할당한 후 같은 방식을 이용.
            
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        else
        {
            answer = arr;    //모두 같으면 그냥 주어진 배열을 2차원 배열이 가리키게 한다.
        }
        return answer;
    }
}
