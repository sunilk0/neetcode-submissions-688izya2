class KthLargest(val k: Int, nums: IntArray) {

      private val pq = PriorityQueue<Int>()


    init {
       for(num in nums){
        pq.add(num)
        if(pq.size > k){
            pq.poll()
        }
       }
    }

    fun add(`val`: Int): Int {

    pq.add(`val`)
    if(pq.size>k){
        pq.poll()
    }
    return pq.peek()

    }
   

  



       
    }

