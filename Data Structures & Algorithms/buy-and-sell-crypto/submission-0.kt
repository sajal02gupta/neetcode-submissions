class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buyMin = prices[0]
        var sellMax = 0
        for (i in 1 until prices.size) {
            val sellPrice = prices[i] - buyMin
            sellMax = max(sellPrice, sellMax)
            buyMin = min(buyMin, prices[i])
            
        }
        return sellMax
    }
}
