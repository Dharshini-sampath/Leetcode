class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1,count=0;
        while(true){
            boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                found=true;
                break;
            }
        }
        if(!found)
        {
            count++;
        }
        if(count==k)
        {
            return num;
        }
        num++;
    }
}
}