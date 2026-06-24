class Solution {
    public boolean check(char top,char upcoming)
    {
        if(top=='(' && upcoming==')') return true;
        if(top=='[' && upcoming==']') return true;
        if(top=='{' && upcoming=='}') return true;

        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {  
            char ch=s.charAt(i);
           if(!stack.isEmpty())
           {
              if(check(stack.peek(),ch))
              {
                stack.pop();
                continue;
              }
           }
           stack.push(ch);
        }
        return stack.isEmpty();
    }
}
