class MinStack {

    private int[] arr;
    private int[] min;
    int top=-1;
    
    public MinStack() {
        arr=new int[3*10000];
        min=new int[3*10000];
    }
    
    public void push(int val) {
        if(top==-1)
            min[top+1]=val;
        else
        {
            min[top+1]=Math.min(min[top],val);
        }
            
        arr[++top]=val;
        
        return;
    }
    
    public void pop() {
        top--;
        return;
    }
    
    public int top() {
       return arr[top];
    }
    
    public int getMin() {
        return min[top];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */