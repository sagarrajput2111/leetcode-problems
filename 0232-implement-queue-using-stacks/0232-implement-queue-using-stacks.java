class MyQueue {
    
    Stack<Integer> s1=new Stack<Integer>(),s2=new Stack<>();
    int size=0;

    public MyQueue() {
        
    }
    
    public void push(int x) {
        
        s1.add(x);
        size++;
        
    }
    
    public int pop() {
        
        size--;
        if(!s2.isEmpty())
            return s2.pop();
        else
        {
            while(!s1.isEmpty())
            {
                s2.add(s1.pop());
            }
            
            s1=new Stack<>();
            return s2.pop();
            
        }
        
        
    }
    
    public int peek() {
        if(!s2.isEmpty())
            return s2.peek();
        else
        {
            while(!s1.isEmpty())
            {
                s2.add(s1.pop());
            }
            
            s1=new Stack<>();
            return s2.peek();
            
        }
        
        
        
    }
    
    public boolean empty() {
        
        return size==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */