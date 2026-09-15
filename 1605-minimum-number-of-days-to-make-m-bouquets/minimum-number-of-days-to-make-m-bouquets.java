class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int totalflower= m*k;
        int result=-1;
        if(totalflower>bloomDay.length) return -1;
        int min = Arrays.stream(bloomDay).min().getAsInt();
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int low=min,high=max;
        while(low<=high)
        {

        int mid=low+(high-low)/2;
    
 
            if(ispossible(bloomDay,mid,m,k))
            {
                 result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
      
    }
    return result;
    }
      public boolean ispossible(int[] bloomDay,int i,int m,int k)
        {
            int count=0;
            int bouquet=0;
            for(int bloom:bloomDay)
            {
                if(bloom<=i)
                {
                    count++;
                    if(count==k)
                    {
                        bouquet++;
                        count=0;
                    }
                }
                else{
                    count=0;
                }

            }
            return bouquet>=m;
        }
}