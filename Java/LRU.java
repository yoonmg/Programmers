import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        LinkedList<String>arr = new LinkedList<>();
        
        if(cacheSize == 0)
        {
            answer = cities.length * 5;      //cahceSize가 0이면 모두 cache miss이기 때문에 cities길이 * 5를 해준다.
        }
        else
        {
            for(int i=0;i<cities.length;i++)
            {
                String city = cities[i].toUpperCase();          //대소문자 구분이 없어야 하니까 모두 대문자로 변경
            
                if(arr.contains(city))
                {
                    arr.remove(city);
                    arr.add(city);                            //cache 안에 city가 존재하면 해당 city를 제거 후 맨 마지막에 추가해준다
                    answer += 1;                              //cache hit이기 때문에 +1 해준다.
                }
                else
                {
                    if(arr.size() >= cacheSize)
                    {
                        arr.remove(0);                      
                    }                                        //arr의 길이가 0이거나 city를 포함하고 있지 않고 cahceSize를 넘지 않을 경우 해당 city를 추가만 해준다.
                    arr.add(city);                           //만약 city를 포함하지는 않지만 cacheSize를 넘어갔을 경우 맨 앞에 있는 city를 제거 후 맨 뒤에 새 city를 추가해준다.
                    answer += 5;                             //cache miss이기 때문에 +5 해준다.
                }
            }
        }
        return answer;
    }
}
