class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    
    //  val map = mutableMapOf<Int, Int>() //value, count

    //  for(num in nums){
    //     map[num] = map.getOrDefault(num,0) + 1
    //  }

    //  val pq = PriorityQueue<Pair<Int,Int>>(compareBy{it.second}) //minheap

    //  for((key,freq) in map){
    //    pq.add(Pair(key,freq))
    //    if(pq.size>k){
    //     pq.poll()
    //    }
    //  }

    // return pq.map { it.first}.toIntArray() //mapping minheap to map with keys.

    //bucket sort
   //step1 :find key, freqs in map
    val map = mutableMapOf<Int,Int>()
    for(num in nums){
        map[num] = map.getOrDefault(num,0)+1
    }

    val bucket = Array(nums.size+1) { mutableListOf<Int>()} //this will 
    //create [ [],[],[]] size +1 becasue of lets say 1->3 times max starts from 1

    for((key,freq) in map){
        bucket[freq].add(key)
    }

    val result = mutableListOf<Int>()
    //iterate from bucket backwards till k.

    for(i in bucket.size-1 downTo 0){
        for(num in bucket[i]){
        result.add(num)
        if(result.size == k){ //here result.size because bucket will have unused or unwanted buckets.
         return result.toIntArray()
        }
        }
    }

    return result.toIntArray()
    

}
}