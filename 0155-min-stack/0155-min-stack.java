class MinStack {

    private long[] arr;
    private int[] min;
    int top=-1;
    long mini;
    
    public MinStack() {
        arr=new long[3*10000];
      //  min=new int[3*10000];
        mini=Long.MAX_VALUE;
    }
    
    public void push(int val) {
        // if(top==-1)
        //     min[top+1]=val;
        // else
        // {
        //     min[top+1]=Math.min(min[top],val);
        // }
            
        if(top==-1)
        {
            mini=val;
            arr[++top]=val;
            
        }
        else
        {
            if(mini>val)
            {
                arr[++top]=val-mini+val;//(2*val-mini)
                mini=val;
            }
            
            else
            {
                arr[++top]=val;
            }
                
        }
        
        
        return;
    }
    
    public void pop() {
        
        
        if(mini<arr[top])
           top--;
        else
        {
            
            mini=mini-arr[top]+mini;//(2*mini-arr[top])
            top--;
        }
    }

    
    public int top() {
       if(mini<arr[top])
           return (int)(arr[top]);
        else
            return (int)(mini);
        
        
    }
    
    public int getMin() {
        return (int)(mini);
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