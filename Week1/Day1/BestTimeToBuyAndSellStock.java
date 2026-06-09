/*class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit=prices[j]-prices[i];
                if(profit>maxProfit){
                    maxProfit=profit;
                }

            }
        }
        return maxProfit;
        
    }
}
*/
// optimal approach 0(n)
class Solution {
    public int maxProfit(int[] prices) {
        int min= prices[0];
        int max=0; // maximum profit
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min= prices[i];
            }
            int profit = prices[i]-min;
            if(profit>max){
                max=profit;
            }

        }
        return max;
        
    }
}
