class MinStack {
    
    private
    List<int[]> stack;
    public MinStack() {
         stack=new ArrayList<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty())
        {                   // main,Min
            stack.add(new int[]{val,val});
        }
        else 
        {
            int min=stack.get(stack.size()-1)[1];
            stack.add(new int[]{val,Math.min(val,min)});
        }
    }
    
    public void pop() {
        if(!stack.isEmpty())
        {
            stack.remove(stack.size()-1);
        }
    }
    
    public int top() {
        return stack.get(stack.size()-1)[0];
    }
    
    public int getMin() {
        return stack.get(stack.size()-1)[1];
    }
}
