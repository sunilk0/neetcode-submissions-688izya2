class Solution {
    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
    //   var l = 0
    //   var r = arr.size - k

    //   while(l<r) {
    //     val m = (l+r)/2
    //     if (x-arr[m] > arr[m+k] - x) {
    //         l = m + 1
    //     }else{
    //         r = m
    //     }
    //   }
    //   return arr.slice(l until l+k)
   var l = 0
   var r = arr.lastIndex

   while(r-l+1>k){
    var left = Math.abs(arr[l]-x)
    var right = Math.abs(arr[r]-x)
    if(left>right){
        l++
    } else {
        r--
    }

   }
    return arr.slice(l..r)
   
    }
}
