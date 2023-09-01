class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];  //행렬의 곱셈은 첫번째 행렬의 행의 개수와 두번째 행렬의 열의 개수를 이용.
        
        for(int i=0;i<answer.length;i++)
        {
            for(int j=0;j<answer[i].length;j++)
            {
                for (int k = 0; k < arr1[i].length; k++) 
                {
                    answer[i][j] += arr1[i][k] * arr2[k][j];        
                }
            }
        }
        return answer;
    }
}
