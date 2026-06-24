class Solution {
    public int findMin(int[] nums) {
        int minEle=Integer.MAX_VALUE;
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {

              int mid=left +(right-left)/2;
              if(nums[mid]<minEle)
              {
                minEle=nums[mid];
              }
              if((mid+1)<nums.length && nums[mid]>nums[right] )
              {
                left=mid+1;
              }
              else{
                right=mid-1;
              }
        }

        return minEle;
    }
}
