class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
      val map = mutableMapOf<Int,Int>()

      for(i in nums.indices){
      
      if(map.contains(nums[i]) && Math.abs(i-map[nums[i]]!!)<=k){
        return true
      }
        map.put(nums[i], i) //number, index
      }

     return false
    }
}
