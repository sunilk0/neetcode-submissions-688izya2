class Solution {
    fun maxArea(heights: IntArray): Int {
       var left = 0
       var right = heights.size - 1
       var maxArea = 0

       while(left<right){
          val area = minOf(heights[left],heights[right]) * (right-left)
          maxArea = maxOf(maxArea, area)
          if(heights[left]<heights[right]){
            left++
          }else{
            right--
          }
       }
       return maxArea
    }
}
