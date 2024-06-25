import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String>stack = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                stack.push(String.valueOf(s.charAt(i)));
            }
            else if(!stack.isEmpty())
            {
                stack.pop();
            }
            else
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
