class Solution {
    public int maxProfit(int[] prices) 
    {
        int buy = 0;
        int sell = 1;
        int n = prices.length;
        int maxProfit = 0;

        while(buy < sell && sell < n)
        {
            if(prices[buy] > prices[sell])
            {
                buy = sell;
            }
            else
            {
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit,profit);
            }
            sell++;
        }
        return maxProfit;
    }
}