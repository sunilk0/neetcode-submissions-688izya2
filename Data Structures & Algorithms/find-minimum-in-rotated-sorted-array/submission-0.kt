class Solution {
    fun findMin(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        //In rotated sorted array, minm element is always at the first portion./
     var l = 0
     var r = nums.size-1
     while(l<r){
        val mid = l + (r-l)/2
        if(nums[mid]<nums[r]){
           r = mid
        } else {
           l = mid + 1
        }
     }
    return nums[l]
    }
}
