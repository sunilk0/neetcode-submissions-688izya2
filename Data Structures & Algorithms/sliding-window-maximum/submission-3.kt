class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
    //   brute force
    //val output = mutableListOf<Int>()

    //    for(i in 0..nums.size-k){
    //     var max = nums[i]
    //     for(j in i until i+k){
    //         max = maxOf(max,nums[j])
    //     }
    //     output.add(max)
    //    }

    //    return output.toIntArray()

    //using deque
    val output = mutableListOf<Int>()
        val q = ArrayDeque<Int>()
        var l = 0
        var r = 0

        while (r < nums.size) {
            //check if the right value is greater than the last stored , if less remove.
            while (q.isNotEmpty() && nums[q.last()] < nums[r]) {
                q.removeLast()
            }
         
         //add right to the queue
            q.addLast(r)

         
            if (l > q.first()) {
                q.removeFirst()
            }
            
        //window size remove
            if ((r + 1) >= k) {
                output.add(nums[q.first()])
                l += 1
            }
            r += 1
        }

        return output.toIntArray()
    }
}

