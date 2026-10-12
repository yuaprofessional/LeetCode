class Solution {
    public int maxProfit(int[] prices) 
    {
        int buy = 0;
        int maxprofit = 0;

        for(int price = 0 ; price < prices.length - 1 ; price++)
        {
            int sell =  price + 1;

            if(prices[buy] < prices[sell])
            {
                int profit = prices[sell] - prices[buy];
                maxprofit = Math.max(maxprofit,profit);
            }
            else
            {
                buy = sell;
            }
        }
        return maxprofit;
    }
}