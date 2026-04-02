class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
    

      if(strs.isEmpty()) return ""
      val first = strs[0]
      for(i in first.indices){
        val c = first[i]

       for(j in 1 until strs.size){
         
         if(i >= strs[j].length || strs[j][i] != c){
            return first.substring(0,i)
         }
       }
      }

      return first
    }
}
