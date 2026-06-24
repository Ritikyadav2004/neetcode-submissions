class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice=0;
        int buyPrice=prices[0];
        for(int i=0;i<prices.length;i++)
        {
           if(buyPrice>prices[i])
           {
            buyPrice=prices[i];
           }

           maxPrice=Math.max(maxPrice,prices[i]-buyPrice);
        }

        return maxPrice;
    }
}
