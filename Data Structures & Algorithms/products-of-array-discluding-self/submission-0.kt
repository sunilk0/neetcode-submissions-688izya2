class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
    //     val n = nums.size
    // val result = IntArray(n)
    // for(i in 0 until n){
    //     var prod = 1
    //     for(j in 0 until n){
    //       if(i==j) continue
    //        prod *= nums[j]
    //     }
    //     result[i] = prod
    // }
    // return result
 val n = nums.size
 val result = IntArray(n)
 val prefix = IntArray(n)
 val postfix = IntArray(n)

 prefix[0] = 1
 postfix[n-1] = 1

 for(i in 1 until n){
  prefix[i] = prefix[i-1] * nums[i-1]
 }

 for(j in n-2 downTo 0){
   postfix[j] = postfix[j+1] * nums[j+1]
 }

 for(i in 0 until n){
    result[i] = prefix[i] * postfix[i]
 }

return result
    }
}
