class Solution {
    public int maxProfit(int[] prices) {
        int last = prices[0], total = 0, n = prices.length;

        for (int i=1;i<n;i++) {
            if (last < prices[i]) {
                total += (prices[i] - last);
            }
            last = prices[i];
        }

        return total;
    }
}
