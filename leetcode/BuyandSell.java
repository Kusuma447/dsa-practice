class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
     
        for(int i=1;i<=prices.length-1;i++){
            if(prices[i]<buy){
            buy=prices[i];
            }
             else if(prices[i]-buy>profit){
                profit=prices[i]-buy;
               }
            }
        return profit;
    }
    
}
class BuyandSell{
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] n={1,2,3,4,5,6,7,8,9,10};
        int res=s.maxProfit(n);
        System.out.println(res);
    }
}