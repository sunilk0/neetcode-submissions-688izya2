class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        val map = mutableMapOf<Int,Int>() //num, index

        for(i in nums.indices){
      val comp = target-nums[i]
      if(map.contains(comp)){
      return intArrayOf(map[comp]!!,i)
      }
            map.put(nums[i],i)
        }

        return intArrayOf(-1,-1)
    }
}
