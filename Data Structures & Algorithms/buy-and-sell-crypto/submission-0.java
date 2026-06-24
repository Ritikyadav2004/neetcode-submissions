class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice=0;
        for(int i=0;i<prices.length;i++)
        {
            int j=i+1;
            while(j<prices.length)
            {

                int sell=prices[j]-prices[i];
                maxPrice=Math.max(sell,maxPrice);
                j++;
            }
        }

        return maxPrice;
    }
}
