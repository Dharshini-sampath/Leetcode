class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high,low=1,i,max=0,mid,ans=0;
        for(int num:nums)
        {
            max=Math.max(max,num);
        }
        high=max;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            int total=val(nums,mid);
            if(total<=threshold)
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
    public int val(int[] nums,int mid)
    {
        int m=0;
        for(int num:nums)
        {
         m+=(num+mid-1)/mid;
        }
        return m;
    }
}