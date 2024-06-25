import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
      
        double[] db = new double[score.length];
        Double[] cmp = new Double[score.length];
        double val = 0;
        
        for(int i=0;i<score.length;i++)
        {
            db[i] = (score[i][0] + score[i][1]) / 2.0;  //각 학생의 평균 점수를 저장.
            cmp[i] = db[i];    //저장된 점수를 내림차순 할 배열로 복사.
        }
        
        Arrays.sort(cmp,Collections.reverseOrder());    
        
        for(int i=0;i<answer.length;i++)
        {
          //내림차순 된 배열과 되지 않은 배열을 비교하면서 가장 높은 점수를 가진 학생의 위치에 등수를 순서대로 삽입.
            if(cmp[i] != val)
            {
                for(int j=0;j<answer.length;j++)
                {
                    if(cmp[i].equals(db[j]))        
                    {
                        answer[j] = i + 1;    //인덱스 + 1을 하면 등수가 결정됨. 그 등수를 answer배열에 위치에 맞게 삽입.
                    }
                }
            }
            
            val = cmp[i];      /* 중복 순위를 고려해서 같은 점수를 가진 학생은 같은 순위를 가져야하는데 같은 점수를 한번 더 계산하면 
                                  등수가 밀리기 때문에 점수가 같은 경우 패스.*/
        }
        return answer;
    }
}
