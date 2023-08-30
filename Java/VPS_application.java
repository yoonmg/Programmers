import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        Stack<Character>stack = new Stack<>();
        char[]arr = new char[len * 2];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = s.charAt(i % len);             //배열 내에 같은 문자열을 두개 넣는다. 배열 내에 있는 문자열을 회전시키는 느낌으로 보기 위해서.
        }
        
        for(int i=0;i<len;i++)                        //이하는 회전된 괄호 문자열이 성립하는지 하지 않는지 확인한다.
        {
            if(arr[i] == ']' || arr[i] == '}' || arr[i] == ')')
            {
                continue;
            }
            else
            {
                for(int j=i;j<len+i;j++)
                {
                    if(arr[j] == '[' || arr[j] == '{' || arr[j] == '(') 
                    {
                        stack.push(arr[j]);
                    } 
                    else if(arr[j] == ']' && !stack.isEmpty() && stack.peek() == '[') 
                    {
                        stack.pop();
                    } 
                    else if(arr[j] == '}' && !stack.isEmpty() && stack.peek() == '{')         
                    {
                        stack.pop();
                    } 
                    else if(arr[j] == ')' && !stack.isEmpty() && stack.peek() == '(') 
                    {
                        stack.pop();
                    } 
                    else 
                    {
                        stack.push(arr[j]);
                    }
                }
                if(stack.isEmpty())
                {
                    answer++;
                }
                stack.clear();
            }
        }
        return answer;
    }
}
