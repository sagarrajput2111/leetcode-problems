class Solution {
    //we are doing this beacuse if we convert -INT_max to positive it will not work properly
    public double pow(double x, long n)
    {
             if(n==0) return 1;
        
        if(n<0)
        {
            n= -(n);
            x= 1/x;
        }
        if(n%2==0)
        {
            return pow(x*x, n/2);
        }
        else
        {
            return x*pow(x*x,(n-1)/2);
        }
            
    }
    public double myPow(double x, int n) {
        return pow(x,(long)(n));
        
    }
}