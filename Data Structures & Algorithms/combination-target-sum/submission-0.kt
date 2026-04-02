class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
      //Moving forward prevents reusing the same element.
      val result = mutableListOf<List<Int>>()

      fun dfs(i:Int, curr: MutableList<Int>, total:Int){
        if(total == target){
            result.add(ArrayList(curr))
            return
        }

        if(i >= nums.size || total > target){
          return
        }

        curr.add(nums[i]) 
        dfs(i,curr,total+nums[i])

        curr.removeAt(curr.size-1)
        dfs(i+1,curr,total)
      }

      dfs(0, mutableListOf(),0)
      return result
    }
}
