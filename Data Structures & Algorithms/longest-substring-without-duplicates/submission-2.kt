class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

    val set = mutableSetOf<Char>()
    var l = 0
    var r = 0
    var result = 0
    while(r<s.length){

        while(set.contains(s[r])){
          //found duplicate
          set.remove(s[l])
          l++
        }

        set.add(s[r])
        result = maxOf(result, set.size)
        r++

    }

   return result
    }
}
