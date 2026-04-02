class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
       var l = 0
       var result = Int.MAX_VALUE
       var total = 0

       for(r in nums.indices){
       total +=nums[r]

        while(total>=target){
            //shrink window from left
            result = minOf(result, r - l + 1)
            total -=nums[l]
            l++
        }

       }

     return if(result == Int.MAX_VALUE) 0 else result
    }
}
