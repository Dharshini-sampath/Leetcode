class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i,j,max=0;
        for(int pile:piles)
        {
            max=Math.max(pile,max);
        }
        int low=1,high=max,ans=max;
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            long hours=val(piles,mid);
            if(hours<=h)
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
    public long val(int[] piles,int speed)
    {
        long total=0;
        for(int pile:piles)
        {
        
         total+=(pile+speed-1)/speed;
        }
    return total;
    }
}
