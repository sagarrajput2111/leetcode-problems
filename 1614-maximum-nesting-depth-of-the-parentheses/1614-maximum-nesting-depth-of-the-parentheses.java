class Solution {
    public int maxDepth(String s) {
        
        int depth=0;
        int finalDepth=0;
       
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)=='(')
            {
                depth++;
                if(depth>finalDepth)
                    finalDepth=depth;
            }
            else if(s.charAt(i)==')')
            {
                depth--;
            }
            
        }
        return finalDepth;
    }
}