class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
     //nums = [2,3,1,5,4]
     //sort desceding 
     //return k-1
     //[1,2,3,4,5]
     //k-1
     //O(n log n)
     
     //min heap
     //add heap
     //size>k , remove smallest element
     //root is k

     //O(n log k)

       val minHeap = PriorityQueue<Int>()

       for(num in nums){
        minHeap.add(num)

        if(minHeap.size>k){
            minHeap.poll()
        }
       }

       return minHeap.peek()



    }
}
