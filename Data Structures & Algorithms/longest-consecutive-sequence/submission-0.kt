class Solution {
    fun longestConsecutive(nums: IntArray): Int {
     var result = 0
     val set = nums.toSet() //converted to set

     for(num in nums){
       if(!set.contains(num-1)){ //it means start the length count
        var currentNum = num
        var length = 1
        while(set.contains(currentNum+1)){ //if it doesnt contain then start the length count.
            length++
            currentNum++
        }
         result = maxOf(result, length)
       }
    
     }
     return result
    }
}
