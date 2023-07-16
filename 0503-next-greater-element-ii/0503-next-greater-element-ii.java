class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
       
        
        int[] ans=new int[nums.length];
        int n=nums.length;
        
        Stack<Integer> stack=new Stack<Integer>();
        
        for(int i = 2 * n - 1; i >= 0; i--)
        {
            
            if(stack.isEmpty())
            {
                ans[i%n]=-1;
                stack.add(nums[i%n]);
                
            }
            
            else
            {
                while(!stack.isEmpty()&&stack.peek()<=nums[i%n])
                {
                    stack.pop();
                }
                
                if(stack.isEmpty())
                    ans[i%n]=-1;
                else
                    ans[i%n]=stack.peek();
                stack.add(nums[i%n]);
                    
                
                
            }
            

            
        }
        for(int data:ans)
            System.out.println(data);
        
        return ans;
        
        
    }
}