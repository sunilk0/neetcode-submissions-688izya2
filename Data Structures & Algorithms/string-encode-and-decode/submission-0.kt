class Solution {

    fun encode(strs: List<String>): String {
         val sb = StringBuilder()
  //"Hello", "World" : length+"#"+string eg: 5#Hello
         for(str in strs){
          sb.append(str.length).append("#").append(str)
         }
         return sb.toString()
    }

    fun decode(str: String): List<String> {
      //find # and before length , after string.
      // 5#Hello5#World
     val result = mutableListOf<String>()
      var i = 0
      while(i<str.length){
       var j = i
       while(str[j] != '#') { //j is at # position.
        j++
       }
       val slen = str.substring(i,j).toInt()
       i = j+1
       result.add(str.substring(i, i + slen))
       i = i + slen
      }

    return result
    }
}
