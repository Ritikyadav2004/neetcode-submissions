class Solution {
    public int maxArea(int[] h) {
        int left=0;
        int right=h.length-1;
        int maxArea=0;
        while(left<=right)
        {
            int width=right-left;
            int length=Math.min(h[left],h[right]);
            maxArea=Math.max(maxArea,length*width);

            if(h[left]<=h[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            

        }


        return maxArea;

    }
}
