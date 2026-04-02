class Solution {
    fun minWindow(s: String, t: String): String {

  var result = Int.MAX_VALUE

   var left = 0
   var resultString = ""

  var tFreq = mutableMapOf<Char,Int>()
  var wFreq = mutableMapOf<Char,Int>()

   //calc, t freq
  for(c in t){
    tFreq[c] = tFreq.getOrDefault(c,0)+1
  }

    var need = tFreq.size
    var have = 0

  for(right in s.indices){
    var c = s[right]
    //cal s freq
    wFreq[c] = wFreq.getOrDefault(c,0) + 1

    if(tFreq.contains(c) && wFreq[c] == tFreq[c] ){
        have++
    }
     
     while(have == need){
        //cal result
        if(right-left+1<result){
            result = right-left+1
            resultString = s.substring(left,right+1)
        }
        //shrink from left
        var leftChar = s[left]

        wFreq[leftChar] = wFreq[leftChar]!! - 1

        if(tFreq.contains(leftChar) && wFreq[leftChar]!! < tFreq[leftChar]!!){
            have--
        }
        left++
     }
  }
    
  return resultString


    }
}
