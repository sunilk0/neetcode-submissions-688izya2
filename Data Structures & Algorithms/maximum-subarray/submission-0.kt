class Solution {
    fun maxSubArray(nums: IntArray): Int {
     if(nums.isEmpty()) return 0

     var currSum = 0
     var totalSum = nums[0]

     for(num in nums){

        if(currSum<0){ //So whenever the current sum drops below zero, we reset it and start a new subarray from the next element.
         currSum = 0
        }

        currSum += num
        totalSum = maxOf(totalSum,currSum)
     }
    return totalSum


    }
}
