class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {

     var map = mutableMapOf<Int,Int>() //prefixsum, count
     var prefixSum = 0
     var count = 0
     map[0] = 1 //imaginary prefix sum of 0 as 1

    for(i in nums.indices){
        prefixSum += nums[i]

        val target = prefixSum - k
       
      if(map.containsKey(target)){
        count += map.getOrDefault(target,0)
      }

      map[prefixSum] = map.getOrDefault(prefixSum,0)+1
    }

    return count
    }
}
