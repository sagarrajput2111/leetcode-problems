class MyStack {
    
    Queue<Integer> q1=new ArrayDeque<Integer>();
    Queue<Integer> q2=new ArrayDeque<Integer>();

    int size=0;
    

    public MyStack() {
        
    }
    
    public void push(int x) {
        
        q2.add(x);
        
        while(!q1.isEmpty())
        {
            q2.add(q1.poll());
        }
        
        q1=q2;
        q2=new ArrayDeque<>();
        size++;
        
        
        
    }
    
    public int pop() {
        
        size--;
        return q1.poll();
        
    }
    
    public int top() {
        
        return q1.peek();
        
    }
    
    public boolean empty() {
        return size==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */