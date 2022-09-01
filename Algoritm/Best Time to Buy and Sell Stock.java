class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=0;
        int buyDayIndex=0;
        for(int i=0; i<prices.length-1;i++)
        {
            if(prices[buyDayIndex]>prices[i+1])
            {
                buyDayIndex=i+1;;
            }
            else
            {
                int tempPofit=prices[i+1]-prices[buyDayIndex];
                profit=profit>tempPofit?profit:tempPofit;
            }
        }
       return profit;
    }
}
