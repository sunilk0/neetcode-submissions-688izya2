class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var result = 0
     if(s.isEmpty()){
        return result
    }

    val fMap = mutableMapOf<Char,Int>()

    var l = 0
    var cMaxF = 0

    for(r in s.indices){
        fMap[s[r]] = fMap.getOrDefault(s[r],0)+1
        cMaxF = maxOf(cMaxF,fMap[s[r]]!!)
         //shrink window
         while(r - l + 1 - cMaxF > k){
           //reduce the count from l
           fMap[s[l]] = fMap[s[l]]!!-1
            l++
         }

        result = maxOf(result, r - l + 1)
    }

return result

      
    }
}
