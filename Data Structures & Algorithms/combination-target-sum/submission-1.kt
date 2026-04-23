class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {


    nums.sort()
    val result = mutableListOf<List<Int>>()

    fun backtrack(current:MutableList<Int>, startIndex:Int,total:Int){
        if(total>target) return

        if(total == target){
            result.add(ArrayList(current))
            return
        }

        for(i in startIndex until nums.size){
            if(nums[i]>target-total) break
            current.add(nums[i])
            backtrack(current,i,total+nums[i])
            current.removeAt(current.size-1)
        }
    }

    backtrack(mutableListOf(),0,0)
    return result

      

    }
}
