class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i,low,high,mid,max=0,sum=0,val,ans=0;
        low=Arrays.stream(weights).max().getAsInt();
        high=Arrays.stream(weights).sum();

        while(low<=high)
        {
            mid=low+(high-low)/2;
            val=fun(weights,mid);
            if(val<=days)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
    }
            public int fun(int[]  weights, int capacity)
        {
            int currentend=0,days=1;
            for(int num:weights)
            {
                if(currentend+num>capacity)
                {
                    days=days+1;
                    currentend=num;
                }
                else{
                    currentend+=num;
                }
            }
            return days;
        }
}