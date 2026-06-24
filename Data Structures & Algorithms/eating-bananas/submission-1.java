class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minEle=piles[0];
        for(int i:piles)
        {
            if(i>minEle)
            {
                minEle=i;
            }
        } 
        int len=piles.length;

        // defining search space 
        int left=1;
        int right=minEle;
        int ans=right;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            long count=0;
            for(int i=0;i<len;i++)
            {
                 count+=Math.ceil((double)piles[i]/mid);

            }

            if(count<=h)
            {
                ans=mid;
                right=mid-1;
            }

            else{
                left=mid+1;
            }
            

        }
        return ans;
    }
}
