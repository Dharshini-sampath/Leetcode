class Solution {

    public int splitArray(int[] nums, int k) {

        int n=nums.length;
        int res=0,low=0,high=0,mid;
        for(int bookpages:nums)
        {
            low=Math.max(low,bookpages);
            high+=bookpages;
        }
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(isallocation(mid,nums,k))
            {
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;

    }
    public boolean isallocation(int mid,int[] nums,int k)
    {
       int  student=1;
        int pages=0;
        for(int bookpages:nums)
        {
            if(pages+bookpages<=mid)
            {
                pages+=bookpages;
            }
            else{
                student++;
                pages=bookpages;
            }
            if(student>k)
            {
                return false;
            }
        }
        return true;
    }
}