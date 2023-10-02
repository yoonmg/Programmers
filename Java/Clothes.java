import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer>hashmap = new HashMap<>();    //hashmap 생성
        
        for(int i=0;i<clothes.length;i++)
        {
            if(hashmap.containsKey(clothes[i][1]))
            {
                int value = hashmap.get(clothes[i][1]);        //hashmap에 의상 종류가 있으면 key(의상종류)의 value값 뽑아서 value값 +1
                
                hashmap.put(clothes[i][1],value + 1);
            }
            else
            {
                hashmap.put(clothes[i][1],1);            //없으면 key-value pair 하나를 만들기
            }
        }
        
        Set<String>keys = hashmap.keySet();
        Iterator<String>it = keys.iterator();            //hashmap 키를 기준으로 탐색 시작
               
        while(it.hasNext())
        {
            String key = it.next();
            int val = hashmap.get(key);          //hashmap 크기 만큼 돌면서 계산
            answer *= val + 1;            //해당 키의 value값 + 1을 모두 하고 각각 서로 곱해주면서 계산
        }
        return answer-1;            //하나도 입지 않은 경우는 없기 때문에 마지막 경우의수를 빼준다.
    }
}
