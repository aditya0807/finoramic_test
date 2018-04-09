public class Solution {
	public int pow(int x, int n, int d) {
	    if(x==0)
	    return 0;
	    long a=x%d;
	    long ans=1;
	    while(n>0)
	    {
	        if((n&1)==1)
	        ans=(ans*a)%d;
	        n=n/2;
	        a=(a*a)%d;
	    }
	    if(ans<0)
	    {
	        ans=(int)(ans+d)%d;
	    }
	    return (int)ans;
	}
}

