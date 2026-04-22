class LRUCache(val capacity: Int) {

  data class Node(var key:Int,
  var value:Int,
   var prev:Node ?= null, 
   var next:Node?=null)

   private val cache = HashMap<Int,Node>()

   private val head = Node(0,0)
   private val tail = Node(0,0)

   init{
    head.next= tail
    tail.prev = head
   }
  
    fun get(key: Int): Int {
       val node = cache[key]
       if(node==null) return -1

       //remove
       remove(node)
       //insertHead
       insertHead(node)

       return node.value
  
    }

    fun put(key: Int, value: Int) {
       val node = cache[key]
       if(node!=null){
        node.value = value
        remove(node)
        insertHead(node)
       }else{
        val newNode = Node(key,value)
        cache[key]= newNode
        insertHead(newNode)
        if(cache.size>capacity){
        val lru = tail.prev!!
        remove(lru)
        cache.remove(lru.key)
       }
       }
       
    }

    fun remove(node:Node){
       val prevNode = node.prev
       val nextNode = node.next
       prevNode?.next = nextNode
       nextNode?.prev = prevNode
    }
    fun insertHead(node:Node){
      node.next = head.next
      node.prev = head
      head.next?.prev = node
      head.next = node
    }
}
