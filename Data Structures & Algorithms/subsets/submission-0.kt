class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
      // This will store all subsets we find
        val result = mutableListOf<List<Int>>()
        
        // Helper function for backtracking
        fun backtrack(index: Int, current: MutableList<Int>) {
            // Add a copy of the current subset to the result
            result.add(ArrayList(current))
            
            // For each remaining number starting from index
            for (i in index until nums.size) {
                // Add nums[i] to the current subset
                current.add(nums[i])
                // Recurse, moving to the next index
                backtrack(i + 1, current)
                // Remove nums[i] (backtrack)
                current.removeAt(current.size - 1)
            }
        }
        
        // Start backtracking from index 0 with an empty subset
        backtrack(0, mutableListOf())
        
        // Return the final list of all subsets
        return result
    }

}
