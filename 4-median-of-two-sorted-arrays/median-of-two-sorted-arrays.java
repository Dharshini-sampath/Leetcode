class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length<nums1.length) return findMedianSortedArrays(nums2,nums1);
        int low=0,high=nums1.length;
        int cut1,cut2;
        int left1,left2,right1,right2;
        while(low<=high)
        {
            cut1=low+(high-low)/2;
            cut2=(nums1.length+nums2.length+1)/2-cut1;

            left1=(cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
            left2=(cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
            right1=(cut1==nums1.length)?Integer.MAX_VALUE:nums1[cut1];
            right2=(cut2==nums2.length)?Integer.MAX_VALUE:nums2[cut2];

            if(left1<=right2&&left2<=right1)
            {
                if((nums1.length+nums2.length)%2==0)
                {
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                }
                else{
                    return Math.max(left1,left2);
                }
            }
            else if(left1>right2){
                high=cut1-1;
            }
            else{
                low=cut1+1;
            }
        }
    return 0.0;
    }
}