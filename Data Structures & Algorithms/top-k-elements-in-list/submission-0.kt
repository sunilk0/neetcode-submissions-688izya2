class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    
     val map = mutableMapOf<Int, Int>() //value, count

     for(num in nums){
        map[num] = map.getOrDefault(num,0) + 1
     }

     val pq = PriorityQueue<Pair<Int,Int>>(compareBy{it.second})

     for((key,freq) in map){
       pq.add(Pair(key,freq))
       if(pq.size>k){
        pq.poll()
       }
     }

    return pq.map { it.first}.toIntArray()
}
}