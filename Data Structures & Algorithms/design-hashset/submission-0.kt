class MyHashSet() {
     private val bucketCount = 769  // a prime number for better distribution
    private val buckets = Array(bucketCount) { mutableListOf<Int>() }

    private fun hash(key: Int): Int {
        return key % bucketCount
    }

    fun add(key: Int) {
        val index = hash(key)
        if (!buckets[index].contains(key)) {
            buckets[index].add(key)
        }
    }

    fun remove(key: Int) {
        val index = hash(key)
        buckets[index].remove(key)  // safe even if key doesn't exist
    }

    fun contains(key: Int): Boolean {
        val index = hash(key)
        return buckets[index].contains(key)
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
