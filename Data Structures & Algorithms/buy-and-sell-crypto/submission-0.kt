class Solution {
    fun maxProfit(prices: IntArray): Int {

  var l = 0
  var r = 1

  var maxProfit = 0

  while(r<prices.size){
    if(prices[l]<prices[r]){
        //caluclate the profit
        val profit = prices[r]-prices[l]
        maxProfit = maxOf(maxProfit,profit)
    } else{
       l = r
    }
    r++
  } 
  return maxProfit
    }
}
