class Solution {
    public int trap(int[] height) {
          int n=height.length;
          int leftArray[]=new int[n];
          int rightArray[]=new int[n];
          
          leftArray[0]=height[0];
          for(int i=1;i<n;i++)
          {
            leftArray[i]=Math.max(leftArray[i-1],height[i]);
          }

          rightArray[n-1]=height[n-1];
          for(int i=n-2;i>=0;i--)
          {
            rightArray[i]=Math.max(height[i],rightArray[i+1]);
          }
    
    int res=0;
          for(int i=0;i<n;i++)
          
          {
res+=Math.min(leftArray[i],rightArray[i])-height[i];
          }


return res;

    }
}
