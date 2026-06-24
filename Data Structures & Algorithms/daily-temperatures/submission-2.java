class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack= new Stack<>();
        int res[]=new int[t.length];

        for(int i=t.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&& t[i]>=t[stack.peek()])
            {
                stack.pop();// poping the elemnt  from stck till the current elemnt is smaller then peek elemt
            }

            /// if stack still have elemnt that mean this will be our maximum warmer temp
            if(!stack.isEmpty())
            {
                res[i]=stack.peek()-i; // subtracting the indices to know the diffrnece

                
            }
            stack.push(i);  // insert the current index in to the stack
        }
        return  res;
    }
}