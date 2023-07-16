class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        Stack<Integer> stack=new Stack<Integer>();
        
        for(int i=nums2.length-1;i>=0;i--)
        {
            
            if(stack.isEmpty())
            {
                hm.put(nums2[i],-1);
                stack.add(nums2[i]);
                
            }
            
            else
            {
                while(!stack.isEmpty()&&stack.peek()<nums2[i])
                {
                    stack.pop();
                }
                
                if(stack.isEmpty())
                    hm.put(nums2[i],-1);
                else
                    hm.put(nums2[i],stack.peek());
                stack.add(nums2[i]);
                    
                
                
            }
            
            
        }
        
       hm.forEach((k,v)->System.out.println(k+"  "+v));
        
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=hm.get(nums1[i]);
        }
        
       
        
        
        return nums1;
        
    }
}