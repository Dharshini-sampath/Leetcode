class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0,high=m-1;
        int left=0,right=0,mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            int row=maxelement(mat,mid,n,m);
            left=mid>0?mat[row][mid-1]:-1;
            right=mid+1<m?mat[row][mid+1]:-1;
            if(mat[row][mid]>left&&mat[row][mid]>right)
            {
                return new int[] {row,mid};
            }
            else if(mat[row][mid]<left)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[] {-1,-1};
    }
    public int maxelement(int[][] mat,int mid,int n,int m)
    {
        int max=-1;
        int index=-1;
        for(int i=0;i<n;i++)
        {
            if(mat[i][mid]>max)
            {
                max=mat[i][mid];
                index=i;
            }
        }
        return index;
    }
}