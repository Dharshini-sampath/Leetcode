class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length;
        int n=matrix.length;
          int low=0,high=n*m-1;
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(matrix[mid/m][mid%m]==target)
            {
                return true;
            }
            if(matrix[mid/m][mid%m]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}